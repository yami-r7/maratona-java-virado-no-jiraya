package io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isArquivoCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isArquivoCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isArquivoRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isArquivoRenamed);

        File fileDiretorioRenamed = new File("pasta02");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(fileDiretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
