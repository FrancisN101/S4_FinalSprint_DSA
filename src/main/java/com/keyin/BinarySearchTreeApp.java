// An application that runs a webpage where a user can input a series of numbers to get the resulting Binary Tree.
// It also stores previous trees and displays all the previous trees on one page.

package com.keyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan("com.keyin.Entity")
public class BinarySearchTreeApp {
    public static void main(String[] args) {
        SpringApplication.run(BinarySearchTreeApp.class, args);
    }
}
