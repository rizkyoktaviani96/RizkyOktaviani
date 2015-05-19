public class mahasiswa {
	private String nama;
	private int umur;

		public mahasiswa(String na, int um){
		nama = na;
		umur = um;
	}

	public void TampilkanBiodata(){
		System.out.println("=== BIODATA ===");
		System.out.println("Nama Mahasiswa = " +nama);
		System.out.println("Umur Mahasiswa = " +umur);		
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String na){
		this.nama = na;
	}
	public int getUmur(){
		return umur;
	}
	public void setUmur(int um){
		this.umur = um ;
	}
}