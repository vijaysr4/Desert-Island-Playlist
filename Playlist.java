import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    //adding songs to the playlist array
    desertIslandPlaylist.add("Arcade - Duncan Laurence");
    desertIslandPlaylist.add("Stan - Eminem");
    desertIslandPlaylist.add("Sweater weather - The Neighbourhood");
    desertIslandPlaylist.add("Lovely - Billie Eilish and Khalid");
    desertIslandPlaylist.add("Derniere danse - Indila");
    desertIslandPlaylist.add("Legends never dies - Pentakill");
    
    // checking the array size
    System.out.println(desertIslandPlaylist.size());
    // removing a song from the array
    desertIslandPlaylist.remove(3);
    System.out.println(desertIslandPlaylist.size());

    //get the indices of the songs which is going to be swapped
    int indexA = desertIslandPlaylist.indexOf("Stan - Eminem");
    int indexB = desertIslandPlaylist.indexOf("Legends never dies - Pentakill");
  
    //Create a temporary variable to store the value of song A
    String tempA = "Stan - Eminem";
    
    //Rewrite the value of the index of A to the value of B
    desertIslandPlaylist.set(indexA, "Legends never dies - Pentakill");
    //Rewrite the value of the index of B to the value of A
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
  }
}
