package Lect2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class L2fileWork {
    public static void main(String[] args) {
        // File f1 = new File("file.txt");
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println(f3.getAbsolutePath ());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

        // try {
        //     Код, в котором может появиться ошибка
        //    } catch (Exception e) {
        //     Обработка, если ошибка случилась
        //    }
        //    finally {
        //     Код, который выполнится в любом случае
        //    }
           
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
            } catch (Exception e){
            System.out.println("catch");
            }
            finally
            {  System.out.println("finally"); }
        
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
            } catch (Exception e) {
            System.out.println("catch");
            }
            finally
            { System.out.println("finally"); }

        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
            System.out.println("file.created");
            }
            else {
            System.out.println("file.existed");
            }
            } catch (Exception e) {
            System.out.println("catch");
            } finally {
            System.out.println("finally");}

        String line = "empty";
        try {
        File file = new File(pathFile);
        if (file.createNewFile()) {
        System.out.println("file.created"); }
        else {
        BufferedReader bufReader =
        new BufferedReader(new FileReader(file));
        System.out.println("file.existed");
        line = bufReader.readLine();
        bufReader.close(); }
        } catch (Exception e) {
        //e.printStackTrace();
        } finally {
        System.out.println(line);
        }

        // isHidden(): возвращает истину, если каталог или файл является скрытым
        // length(): возвращает размер файла в байтах
        // lastModified(): возвращает время последнего изменения файла или каталога
        // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        // listFiles(): возвращает массив файлов и подкаталогов, которые находятся
        // в определенном каталоге
        // mkdir(): создает новый каталог
        // renameTo(File dest): переименовывает файл или каталог

        // length(): возвращает размер файла в байтах
        // lastModified(): возвращает время последнего изменения
        // файла или каталога
        // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        // listFiles(): возвращает массив файлов и подкаталогов, которые
        // находятся в определенном каталоге
        // mkdir(): создает новый каталог
        // renameTo(File dest): переименовывает файл или каталог

        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath ());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        } 

        
    }
}
