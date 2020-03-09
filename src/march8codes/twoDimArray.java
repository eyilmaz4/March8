package march8codes;

public class twoDimArray {
    public static void main(String[] args) {
String [][] myCities=createRandomCities(4,3);
for(String [] row:myCities){
    for(String city:row){
        System.out.println(city);
    }
}
        System.out.println();
citiesA(myCities);
printCitiesReversed(myCities);
        System.out.println();
cityNameA_H(myCities);
    }
    public static String [][] createRandomCities(int rows, int cols){
        String[] cities={"Ann Arbor", "Forth worth", "Fairfax", "orlando", "Denver", "Portland", "Phoneix","Arlington", "Atlanta", "Amarillo", "Bouldre", "Chicago", "Albany"};
       String [][] randCities=new String [rows][cols];
       int index;
       for(int i=0; i<randCities.length; i++){
           for(int j=0; j<randCities[i].length; j++){
               randCities[i][j]=cities[(int)(Math.random()*10)];
           }
        }
       return randCities;
    }
    public static void citiesA(String [][] cities) {

        for (String[] row : cities) {
            for (String city : row) {
                if (city.charAt(0) == 65) {
                    System.out.println(city);
                }
            }
        }
    }

    public static void printCitiesReversed(String[][]cities) {
        for (String row[] : cities) {
            for (String city : row) {
                System.out.println(city);
            }
        }
    }

            public static String reversedCity (String text){
                String reversed = " ";
                for (int i = text.length() - 1; i >= 0; i++) {
                    reversed += text.charAt(i);

                }
                return reversed;
            }

            public static void cityNameA_H(String[][]cities){
        for(int i=0; i<cities.length; i++){
            for(int j=0; j<cities[i].length; j++){

                if((char)cities[i][j].charAt(0)>=65 && (char)cities[i][j].charAt(0)<=72){
                    System.out.println(cities[i][j]);
                }
            }
        }
            }
        }



