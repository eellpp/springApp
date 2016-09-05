import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entities.AppConfig;
import entities.BaseballGame;
import entities.Cubs;
import entities.Game;
import entities.RedSox;
import entities.Team;

public class GamesApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

		Game game = context.getBean("game", Game.class);
//        Team royals = context.getBean("royals", Team.class);
//        Team redSox = context.getBean("redSox", Team.class);
//        Team cubs = context.getBean("cubs", Team.class);

//        game.setHomeTeam(royals);
//        game.setAwayTeam(cubs);
//        game.playGame();
//
//        game.setHomeTeam(cubs);
//        game.setAwayTeam(redSox);
//        game.playGame();
//
        context.close();
        System.out.println(game.toString());
    }

}
