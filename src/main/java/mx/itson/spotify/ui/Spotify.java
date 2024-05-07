/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.ui;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import mx.itson.spotify.entities.*; // (* -> all) WILDCARD. El asterisco importa todas las clases.
/*
import mx.itson.spotify.entities.Album;
import mx.itson.spotify.entities.Artista;
import mx.itson.spotify.entities.Cancion;
*/

/**
 *
 * @author Mariana Arámbula
 */
public class Spotify {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Ezkai");
        artista.setPerfil("Artista versátil y blablabla.");
        artista.setOyentesMes(100000);
        artista.setFollowers(550000);
        
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Lo Mínimo");
        cancion1.setDuracion(180);
        
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Villain");
        cancion2.setDuracion(200);
        
        List<Cancion> temas = new ArrayList<>();
        temas.add(cancion1);
        temas.add(cancion2);
        
        Album album = new Album();
        album.setNombre("Rain");
        album.setArtista(artista);
        album.setFechaLanzamiento(new Date());
        album.setCancion(temas);
        album.setGenero("Pop");   
        
        System.out.println("Álbum: " + album.getNombre());
        System.out.println("Artista: " + album.getArtista().getNombre());
        System.out.println("Género: " + album.getGenero());
        System.out.println("Lanzamiento: " + album.getFechaLanzamiento());
        System.out.println("Canciones:");
        for(Cancion c : album.getCancion()){
            System.out.println(c.getTitulo());
        }
        

    }
}
