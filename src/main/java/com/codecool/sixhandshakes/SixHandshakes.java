package com.codecool.sixhandshakes;

import com.codecool.sixhandshakes.finders.HandshakeCalculator;
import com.codecool.sixhandshakes.model.UserNode;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class SixHandshakes {
    private static List<UserNode> users;
    private static GraphPlotter graphPlotter;

    public static void main(String[] args) {
        UserNode start = null;
        UserNode finish = null;
//        boolean checher;
        initSocialGraph();

        int menuOption = getIntAsInput();
        switch (menuOption) {
            case 1:
                String firstName1 = users.get(4).getFirstName();
                String lastName1 = users.get(4).getLastName();
                String firstName2 = users.get(7).getFirstName();
                String lastName2 = users.get(7).getLastName();
                for (int j = 0; j < users.size(); j++) {
                    for (int i = 0; i < users.size(); i++) {
                        if (Objects.equals(users.get(i).getFirstName(), firstName1) && Objects.equals(users.get(i).getLastName(), lastName1)) {
                            if (Objects.equals(users.get(j).getFirstName(), firstName2) && Objects.equals(users.get(j).getLastName(), lastName2)) {
                                start = users.get(i);
                                finish = users.get(j);
                            }
                        }
                    }
                }

                int count = HandshakeCalculator.getMinimumHandshakesBetween(start, finish);
                System.out.println("Handshakes between " + start + " and " + finish + " is " + count + " ");
                ;
            case default:
                System.out.println("There are no menu options, please try again ");

        }

        graphPlotter = new GraphPlotter(users);
        System.out.println("Done!");

    }

    private static void initSocialGraph() {
        RandomDataGenerator generator = new RandomDataGenerator();
        users = generator.generate();
    }

    private static void visualizeFriendCircle(Set<UserNode> friendCircle, UserNode user) {
        graphPlotter.highlightNodes(friendCircle, user);
    }

    private static void printRoutes(List<List<UserNode>> routes) {
        for (List<UserNode> nodes : routes) {
            System.out.print("\nRoute with " + nodes.size() + " steps:");
            for (int i = 0, nodesSize = nodes.size(); i < nodesSize; i++) {
                UserNode node = nodes.get(i);
                System.out.print(" " + node.getId());
                if (i < nodesSize - 1) {
                    System.out.print(" ->");
                }
            }
        }
        System.out.println();
    }


    private static int getIntAsInput() {
        int choose = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose from the menu: ");
            System.out.println("1. Minimum handshakes");
            choose = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Not valid form.");
            getIntAsInput();
        }

        return choose;
    }


}

