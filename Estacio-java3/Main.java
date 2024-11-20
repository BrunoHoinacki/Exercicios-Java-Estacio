public class Main {

    // Classe para representar um vetor 3D
    static class Vetor {
        double x, y, z;

        public Vetor(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Produto escalar entre dois vetores
        public double produtoEscalar(Vetor outro) {
            return this.x * outro.x + this.y * outro.y + this.z * outro.z;
        }

        // Verifica se dois vetores são paralelos
        public boolean isParalelo(Vetor outro) {
            // Verifica se as coordenadas são proporcionais
            return (this.x / outro.x == this.y / outro.y) &&
                    (this.y / outro.y == this.z / outro.z);
        }
    }

    // Classe para representar um plano
    static class Plano {
        Vetor normal;
        double constante;

        public Plano(double a, double b, double c, double constante) {
            this.normal = new Vetor(a, b, c);
            this.constante = constante;
        }
    }

    // Classe para representar uma reta
    static class Reta {
        Vetor diretor;

        public Reta(double vx, double vy, double vz) {
            this.diretor = new Vetor(vx, vy, vz);
        }

        // Verifica se a reta é paralela ao plano
        public boolean isParalelaAoPlano(Plano plano) {
            return plano.normal.produtoEscalar(this.diretor) == 0;
        }

        // Verifica se a reta é ortogonal ao plano
        public boolean isOrtogonalAoPlano(Plano plano) {
            return this.diretor.isParalelo(plano.normal);
        }
    }

    public static void main(String[] args) {
        // Exemplo 1: Verificar se plano e reta são ortogonais
        Plano plano1 = new Plano(2, -4, 2, 8); // Plano 2x - 4y + 2z = 8
        Reta reta1 = new Reta(-1, 2, -1); // Reta com vetor diretor (-1, 2, k)

        System.out.println("Plano 1 e Reta 1 são ortogonais? " + reta1.isOrtogonalAoPlano(plano1));

        // Exemplo 2: Verificar se plano e reta são paralelos
        Plano plano2 = new Plano(2, 3, 1, 4); // Plano 2x + 3y + z = 4
        Reta reta2 = new Reta(-1, 2, -4); // Reta com vetor diretor (-1, 2, -4)

        System.out.println("Plano 2 e Reta 2 são paralelos? " + reta2.isParalelaAoPlano(plano2));

        // Exemplo 3: Criar planos paralelos e ortogonais aos eixos
        Plano planoParaleloXY = new Plano(0, 0, 1, -5); // z = 5
        Plano planoParaleloXZ = new Plano(0, 1, 0, -3); // y = 3
        Plano planoParaleloYZ = new Plano(1, 0, 0, -7); // x = 7

        System.out.println("Plano paralelo ao XY: z = 5");
        System.out.println("Plano paralelo ao XZ: y = 3");
        System.out.println("Plano paralelo ao YZ: x = 7");
    }
}
