
public class GeographyFactory {
    
    public Geography getGeography(String geographyType){

        if (geographyType == null){
            return null;
        }
        else if (geographyType.toLowerCase() == "mountains"){
            return new Mountains();
        }
        else if(geographyType.toLowerCase() == "oceans"){
            return new Oceans();
        }
        else if (geographyType.toLowerCase() == "rivers"){
            return new River();
        }
        else if (geographyType.toLowerCase() == "lakes"){
            return new Lakes();
        }
        else if (geographyType.toLowerCase() == "grasslands"){
            return new Grassland();
        }

        return null;

    }

}
