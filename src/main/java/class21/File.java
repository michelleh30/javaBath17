package class21;
/*
Create a class File that will have the following behaviors: open(), edit(), close()
and fields like name and size. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
 open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc.Create a tester
 class and call all of the methods from these classes.
 */
public abstract class File {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();//abstract, this is what other user and change

    public void edit(){
        System.out.println("Editing the file" +name);//implemented method, code inside them
    }

    public void close(){
        System.out.println("Closing the file" +name);//implemented method

    }
}
class JavaFile extends  File{

    public JavaFile(String name, int size) {
        super(name, size);//calling the con
    }

    @Override
    public void open(){
        System.out.println("opening javaFile using Intellij");
    }
}
class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("using Microsoft word to open Word file");
    }
}
class PDFFile extends File{

    public PDFFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("Using Adobe to open PDF file");
    }
}



