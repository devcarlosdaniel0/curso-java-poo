package projeto.youtube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 100 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Carlos", 16, "M", "carlao");
        g[1] = new Gafanhoto("Maria", 17, "F", "duda");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Carlos assiste HTML5
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); // Maria assiste PHP
        System.out.println(vis[1].toString());
        
        /*System.out.println("Vídeos\n---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGafanhotos\n---------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}