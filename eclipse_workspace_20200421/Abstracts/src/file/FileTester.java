package file;

class FileTester {

	public FileTester() {
	}
	
	public static void main(String[] args) {

		JPGFile jpg = new JPGFile();
		
		jpg.setName("Event01.jpg");
		jpg.open();
		jpg.close();
		
		System.out.println("JPG file name: " + jpg.getName());
		
		PDFFile pdf = new PDFFile("AgileBook.pdf");
		
		System.out.println("PDF file name: " + pdf.getName());
		
	}

}
