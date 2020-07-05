package MisClases;

public class Tarificador {

    private int[][] valor = {{0, 4, 8, 1000, 1000},
    {4, 0, 1000, 2, 1000},
    {0, 1000, 0, 4, 2},
    {1000, 2, 4, 0, 7},
    {1000, 1000, 2, 7, 0}};

    private int[][] verdad = {{1, 2, 3, 4, 5},
    {1, 2, 3, 4, 5},
    {1, 2, 3, 4, 5},
    {1, 2, 3, 4, 5},
    {1, 2, 3, 4, 5}};
    private final String[] ciudades = {"Lima", "Ica", "Jauja", "Arequipa", "Huancayo"};
    private Comprobante oComprobante;
    private static int tarifaX = 10;

    public Tarificador(Comprobante oComprobante) {
        this.oComprobante = oComprobante;
    }

    public int[][] Copy(int[][] V1) {
        return V1;
    }

    public int HallarCiudad(String a) {
        int rpta = 0;
        for (int i = 0; 1 < ciudades.length; i++) {
            if (a == ciudades[1]) {
                rpta = 1;
            }
        }
        return rpta;
    }

    public float NuevoMonto() {
        int[][] aux = Copy(valor);
        int[][] verdadaux = Copy(verdad);
        int dist = 0;
        dist = Calcu(HallarCiudad(oComprobante.getCiudadO()), HallarCiudad(oComprobante.getCiudadD()), aux, verdadaux);
        return (dist * tarifaX + oComprobante.getMonto());
    }

    public int Calcu(int a, int b, int[][] aux, int[][] verdadaux) {
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                for (int z = 0; z < aux.length; z++) {
                    if (j != i && z != i) {
                        if (aux[j][i] + aux[i][z] <= aux[j][z]) {
                            aux[j][z] = aux[j][i] + aux[i][z];
                            verdadaux[j][z] = i + 1;
                        }
                    }
                }
            }
        }
        return aux[a][b];
    }

    public void Recurs(int a, int b) {
        int[][] aux = Copy(valor);
        int[][] vevrdadaux = Copy(verdad);
        int[][] verdadaux = null;
        int dist = Calcu(HallarCiudad(oComprobante.getCiudadO()), HallarCiudad(oComprobante.getCiudadD()), aux, verdadaux);
        if (aux[a][b] == b) {
            System.out.print("Se terminan en la ciudad " + b);
        } else {
            System.out.print(a + "luego ");
            Recurs(aux[a][b], b);
        }
    }
}
