package collectionf;
class TestCompareTo
{
 System.out.println("A".compareTo("Z")); // -ve
 System.out.println("Z".compareTo("K")); // +ve
 System.out.println("A".compareTo("A")); // zero
 System.out.println("A".compareTo(null)); //RE: NPE
}