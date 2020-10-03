package cdi.editor;

import javax.enterprise.context.RequestScoped;

import cdi.qualifier.PngFileEditorQualifier;

@PngFileEditorQualifier
public class PngFileEditor implements ImageFileEditor {
   
    public String openFile(String fileName) {
        return "Opening PNG file " + fileName;
    }

    public String editFile(String fileName) {
        return "Editing PNG file " + fileName;
    }
    
    public String writeFile(String fileName) {
        return "Writing PNG file " + fileName;
    }

    public String saveFile(String fileName) {
        return "Saving PNG file " + fileName;
    }
}