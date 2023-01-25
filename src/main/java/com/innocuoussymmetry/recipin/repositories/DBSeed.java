package com.innocuoussymmetry.recipin.repositories;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.awt.EventQueue;
import java.util.stream.Stream;

@Configuration
@PropertySource("classpath:/resources/app.properties")
public class DBSeed {
    private String constring;
    private Connection conn;

    public DBSeed(String constring) {
        this.constring = constring;
    }


    private void connect() {
        try {
            this.conn = DriverManager.getConnection(constring);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void disconnect() {
        try {
            if (this.conn.isClosed()) {
                return;
            }

            this.conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private void seed() {
        this.connect();

        try {
            Statement statement = conn.createStatement();

            String[] orderedPaths = {
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createappusers.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createingredient.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcollection.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/creategrocerylist.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcuisine.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcourse.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createrecipe.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createrecipecomments.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcmp_recipeingredient.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcmp_recipecollection.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcmp_usersubscriptions.sql",
                "src/main/java/com/innocuoussymmetry/recipin/repositories/sql/create/createcmp_userfriendships.sql",
            };
            File[] pathObjects = new File[orderedPaths.length];

            int i = 0;
            for (String path : orderedPaths) {
                pathObjects[i] = new File(path);
                i++;
            }

            i = 0;
            while (i < orderedPaths.length) {
                String statementBody = "";

                FileReader fr = new FileReader(pathObjects[i]);
                BufferedReader br = new BufferedReader(fr);
                var lines = br.lines().toArray();

                for (var line : lines) {
                    statementBody += line + " ";
                }

                statement.execute(statementBody);
                i++;
            }

            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        this.disconnect();
    }

    public static void main(String[] args) {
        new DBSeed("jdbc:postgresql://localhost:5432/recipinV2?username=postgres&password=postgres").seed();
    }
}
