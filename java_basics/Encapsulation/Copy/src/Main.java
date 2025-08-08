public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions();
        dimensions.setWidth(14);
        dimensions.setLenght(26);
        dimensions.setHeight(10);
        dimensions.getVolume();

        Cargo example = new Cargo(0, "city/street/house/app",
                false, "749bcq1", false, dimensions);
        example.setWeight(30);
        example.setAddress("Moscow/Akademichesckaya/47/21");
        example.setTurn(false);
        example.setRegNumber("105cvk1010");
        example.setFragile(true);

        System.out.println(example);



    }
}

