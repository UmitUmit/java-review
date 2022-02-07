public class TeamTest {

    public static void main(String[] args) {


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        //Team liverpool = new Team("Liverpool");

        Team<BaseballPlayer> liverpool = new Team<>("Liverpool");

        //Team<String> brokenTeam = new Team<>("this wont work");

        //liverpool.addPlayer(joe);
        liverpool.addPlayer(pat);
        //liverpool.addPlayer(beckham);

    }
}
