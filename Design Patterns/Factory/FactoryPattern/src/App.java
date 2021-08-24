public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        GeographyFactory builder = new GeographyFactory();

        String[] buildWorld = {"oceans", "mountains", "rivers", "lakes", "grasslands"};
        
        for (int i = 0; i < buildWorld.length; i++){
            Geography newGeography = builder.getGeography(buildWorld[i]);
            newGeography.create();
        }
    }
}
