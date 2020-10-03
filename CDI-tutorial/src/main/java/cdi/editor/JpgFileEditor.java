package cdi.editor;

import javax.enterprise.context.RequestScoped;

import cdi.qualifier.JpgFileEditorQualifier;

@JpgFileEditorQualifier
public class JpgFileEditor implements ImageFileEditor {
   
    public String openFile(String fileName) {
        return "Opening JPG file " + fileName;
    }

    public String editFile(String fileName) {
        return "Editing JPG file " + fileName;
    }
    
    public String writeFile(String fileName) {
        return "Writing JPG file " + fileName;
    }

    public String saveFile(String fileName) {
        return "Saving JPG file " + fileName;
    }
}