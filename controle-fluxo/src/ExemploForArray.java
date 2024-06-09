public class ExemploForArray {
        public static void main(String[] args) {
            String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };


             //Forma abreviada
	        /*for(String aluno : alunos) {
                System.out.println(alunos);
                }*/

            //lenhth  se referencia ao tamnho do Array
            for (int x=0; x<alunos.length; x++) {
                System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
            }

            //Forma abreviada
	        /*for(@SuppressWarnings("unused") String aluno : alunos) {
            System.out.println(alunos);
            }*/

            String livros[] = { "Aventura 1", "Aventura 2", "Aventura 3"};

            for(int y=0; y <livros.length; y++){
            System.out.println("Livros :"+ livros[y]);
        
        }

        }
}

