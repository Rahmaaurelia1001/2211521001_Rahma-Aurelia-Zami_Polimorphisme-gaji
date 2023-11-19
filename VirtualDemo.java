public class VirtualDemo 
{
    public static void main(String[] args) 
    {

                Pegawai[] dataKaryawan = new Pegawai[3]; 
                //Polimorpisme
                dataKaryawan[0] = new Gaji("Rahma", "Padang", 3, 200000.00); 
                dataKaryawan[1] = new Gaji("Aurelia", "Bukittinggi", 2, 250000.00); 
                dataKaryawan[2] = new Gaji("Zami", "Bukittinggi", 1, 1000000.00);
                System.out.println("Memanggil mailCheck menggunakan polimorfisme---");
                for (Pegawai pegawai : dataKaryawan) {
                    pegawai.mailCheck(); 
                }
            }
}