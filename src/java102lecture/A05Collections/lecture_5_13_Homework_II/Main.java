package java102lecture.A05Collections.lecture_5_13_Homework_II;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of teams: ");
        int teamCount = input.nextInt();

        List<String> teams = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            String team = input.next();
            teams.add(team);
        }

        if (teamCount % 2 != 0) {
            teams.add("BAY");
            teamCount += 1;
        }


        List<Map<String, String>> allMatches = new ArrayList<>();
        for (int i = 0; i < teamCount - 1; i++) {
            List<String> copyTeams = new ArrayList<>(teams);
            Map<String, String> weekMatches = new HashMap<>();
            while (copyTeams.size() > 0) {
                String team1 = copyTeams.get(new Random().nextInt(copyTeams.size()));
                String team2 = copyTeams.get(new Random().nextInt(copyTeams.size()));
                if (team2.equals(team1)) {
                    copyTeams.remove(team1);
                    team2 = copyTeams.get(new Random().nextInt(copyTeams.size()));
                    copyTeams.add(team1);
                }
                String finalTeam1 = team1;
                String finalTeam2 = team2;
                Optional<Map<String, String>> matchControl = allMatches.stream().filter(item -> (item.get(finalTeam1) != null && item.get(finalTeam1).equals(finalTeam2)) || (item.get(finalTeam2) != null && item.get(finalTeam2).equals(finalTeam1))).findAny();
                if (matchControl.isPresent()) {
                    continue;
                }
                copyTeams.remove(team1);
                copyTeams.remove(team2);
                weekMatches.put(team1, team2);
            }
            allMatches.add(weekMatches);
        }
        for (int i = 1; i < teamCount; i++) {
            System.out.println("Round : " + i);
            Map<String, String> matches = allMatches.get(i - 1);
            matches.forEach((key, value) -> System.out.println(key + " vs " + value));
            System.out.println();
        }
        for (int i = teamCount; i < 2 * teamCount - 1; i++) {
            System.out.println("Round : " + i);
            Map<String, String> matches = allMatches.get(i - teamCount);
            matches.forEach((key, value) -> System.out.println(value + " vs " + key));
            System.out.println();
        }
    }
}
