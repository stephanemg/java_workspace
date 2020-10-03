package cdi.editor;

import javax.enterprise.context.RequestScoped;

import cdi.qualifier.GifFileEditorQualifier;

@GifFileEditorQualifier
public class GifFileEditor implements ImageFileEditor {
    
    public String openFile(String fileName) {
        return "Opening GIF file " + fileName;
    }

    public String editFile(String fileName) {
        return "Editing GIF file " + fileName;
    }
    
    public String writeFile(String fileName) {
        return "Writing GIF file " + fileName;
    }

    public String saveFile(String fileName) {
        return "Saving GIF file " + fileName;
    }
}