public class testmahasiswa
{
		public static void main (String[] args)
		{
			mahasiswa mhs = new mahasiswa("Ridwan Rismanto", 20);
			mhs.TampilkanBiodata();

			System.out.println();

			mhs.setUmur(25);
			mhs.TampilkanBiodata();
		}
}