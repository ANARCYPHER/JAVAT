public class CompareStrings {

    public static void main(String[] args) {

        String style = "Bold";
        String style2 = "Bold";

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

//////////////////////////

Public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

//////////////////////

public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        boolean result = style.equals("Bold"); // true
        System.out.println(result);

        result = style2 == "Bold"; // false
        System.out.println(result);

        result = style == style2; // false
        System.out.println(result);

        result = "Bold" == "Bold"; // true
        System.out.println(result);
    }
}