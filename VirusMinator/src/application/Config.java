package application;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javafx.scene.image.ImageView;

public class Config {
	public static final int BLOCROUGEHOPITAL = 445;
	public static final int BlocSpawnMob = 477;
	public static final int BLocBasDroiteArriveMob = 305;
	public static final int PlacementTourelles = 269;
	public static final int BlocBlancHopital = 535;
	public static final int Chemin = 376;
	public static final int BordTerrain = 388;
	public static final int Herbe = 219;
	public static final int Sable = 350;
	public static final int BlocVioletSpawnMobSurement = 497;
	public static final int BlocVertSpawnMob = 289;
	public static List<Integer> listeMap = Arrays.asList(388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 289, 497, 497, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 350, 350, 350, 219, 219, 219, 219, 350, 350, 350, 350, 388, 289, 289, 497, 497, 350, 350, 350, 350, 350, 350, 350, 269, 350, 350, 350, 219, 219, 219, 350, 219, 219, 219, 350, 350, 350, 350, 350, 388, 497, 497, 289, 497, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 219, 219, 219, 219, 350, 350, 350, 350, 350, 350, 388, 526, 497, 497, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 350, 219, 219, 350, 350, 350, 350, 350, 350, 350, 388, 497, 497, 289, 497, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 289, 289, 497, 497, 350, 350, 350, 350, 350, 350, 350, 269, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 289, 497, 497, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 269, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 350, 219, 219, 219, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 219, 219, 219, 219, 219, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 219, 219, 219, 219, 219, 219, 350, 350, 350, 350, 350, 350, 350, 269, 350, 376, 350, 350, 350, 350, 350, 269, 350, 350, 350, 350, 388, 388, 219, 219, 219, 219, 219, 219, 219, 350, 350, 350, 350, 350, 350, 350, 350, 376, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 350, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 376, 305, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 350, 219, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 350, 388, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 350, 350, 350, 350, 219, 219, 219, 219, 219, 269, 219, 219, 219, 350, 388, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 350, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 219, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388, 388);
	public static String imageDe(int n) {
		/*if (n == 445)
			return "rougeHopital";
		else*/ if (n == 477)
			return "spawnMob";
		else if (n == 305)
			return "hitBoxHosto";
		else if (n == 269)
			return "spawnTourelles";/*
		else if (n == 535)
			return "blancHopital";*/
		else if (n == 376)
			return "sableChemin";
		else if (n == 388)
			return "BordTerrain";
		else if (n == 219)
			return "herbe";
		else if (n == 350)
			return "sable";
		else if (n == 497)
			return "violetEnnemi";
		else if (n == 289)
			return "vertEnnemi";
		else
			return null;
	}
	public static ImageView getImg(String... paths) {
		return new ImageView(Paths.get(System.getProperty("user.dir"), paths).toUri().toString());
		// ImageView(Paths.get(Paths.get(System.getProperty("user.dir"),
		// "ressources").toString(), paths).toUri().toString());
	}

}
