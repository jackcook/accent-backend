package models;

public class ListeningExercise {

    private int id;
    private String name;
    private String[] sentences;

    public ListeningExercise(int i, String n, String[] s) {
        id = i;
        name = n;
        sentences = s;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getSentences() {
        return sentences;
    }

    public static ListeningExercise[] getExercises() {
        return new ListeningExercise[]{
            new ListeningExercise(0, "test", new String[]{
                    "Si vous aimez les édifices historiques et religieux, ne manquez pas la cathédrale Saint Pierre",
                    "C'est la basilique de la Visitation qui offre une vue splendide sur la ville, et bien entendu le palais de l'Isle."
            }),
            new ListeningExercise(1, "test", new String[]{
                    "A l'école, il y a beaucoup de langues.",
                    "Je parle anglais et je parle aussi un peu d’italien.",
                    "Maintenant, j’étudie le français.",
                    "Je vais visiter la France avec un ami.",
                    "Il s’appelle Thomas.",
                    "Nous allons a Paris, pour voir la tour Eiffel et la pyramide du Louvre."
            }),
            new ListeningExercise(2, "test", new String[]{
                    "Bonjour, je m’appelle Élisabeth.",
                    "J’ai vingt-neuf ans et je suis française.",
                    "Je suis née à Lyon, mais j’ai grandi à Marseille.",
                    "Je suis allée à l'université à Paris.",
                    "Maintenant, j’habite à Strasbourg et je suis ingénieur."
            }),
            new ListeningExercise(3, "test", new String[]{
                    "J’aime beaucoup voyager. je parle espagnol et allemand.",
                    "Je viens de rentrer du Portugal, et l'année prochaine, je vais visiter l’Angleterre pour la première fois.",
                    "Il y a beaucoup d’autres pays que je veux visiter, mais je n’ai pas assez de temps.",
                    "Bien sûr, je dois travailler, comme tout le monde.",
            }),
            new ListeningExercise(4, "test", new String[]{
                    "Dans la région où j’habite, il y a une grande rivière.",
                    "Cette rivière est très large et elle est bordée par de hautes falaises escarpées.",
                    "C’est très joli. Mon village est situé dans une grande baie, entre deux montagnes.",
                    "Au bord de la baie, il y a une petite plage d’où on peut voir les bateaux passer et où on peut aller à la pêche.",
                    "Papa et moi y allons souvent ensemble."
            }),
            new ListeningExercise(5, "test", new String[]{
                    "Autrefois, le Français faisaient leurs achats dans toute une série de petits magasins spécialisés",
                    "le lait et le fromage à la crèmerie, la viande chez le boucher",
                    "les fruits et les légumes au marché ou bien chez le primeur, et cetera.",
            }),
            new ListeningExercise(6, "test", new String[]{
                    "Ce ne sont pas seulement les magasins d’alimentation qui s’en vont",
                    "les hypermarchés - avec leurs rayons de produits alimentaires, quincaillerie, vetements, électroménager, jouets et autres produits non comestibles - détournent beaucoup de clients aussi.",
                    "Résultat: toutes sortes de magasin sont obligés de cesser leurs activités",
                    "La seule exception, dans une certaine mesure, semble être les boulangeries. ",
            }),
            new ListeningExercise(7, "test", new String[]{
                    "Bien qu'affilié, les associations ne suivent pas toutes le même programme, donc les offres de chacune varient.",
                    "À Hyères, il y a une trentaine d’ateliers proposés: des langues, des jeux, et de l’artisanat.",
                    "Lors de notre dernière année, mon mari avait animé 4 des 5 niveaux de cours d’anglais, et notre départ a secoué l’organisation.",
                    "Il a passé des mois à essayer de trouver ses remplaçants, avec peu de succès.",
                    "En fin de compte, l’AVF a dû annuler plusieurs niveaux - c'était vraiment dommage."
            }),
            new ListeningExercise(8, "test", new String[]{
                    "Charles accepte d’envoyer Jeanne à Orléans, qui est assiégée par les Anglais.",
                    "Le 29 avril 1429, la population l’y accueille avec enthousiasme, même si les capitaines de guerre sont tout d’abord réservés.",
                    "Mais la foi et l’enthousiasme de Jeanne parviennent à redonner de l’espoir aux soldats désespérés.",
                    "Le 8 mai, les Anglais sont contraints à lever le siège de la ville."
            }),
            new ListeningExercise(9, "test", new String[]{
                    "D’abord, pendant notre premier jour dans la ville, il faut que nous voyions les immeubles religieuses.",
                    "Abidjan abrite de nombreuses grandes mosquées, comme la mosquée de Treichville, la mosquée de Cocody, et la mosquée du Plateau.",
                    "Il est nécessaire que nous allions aux mosquées, parce que l’Islam est la religion la plus populaire de la Côte d’Ivoire, alors c’est une grande partie de la culture du pays.",
                    "Nous verrons plus d’immeubles pendant les deuxième et troisième jours, quand nous visiterons les monuments et les musées, parce qu’il y en a beaucoup dans la ville.",
            }),

        };
    }
}
