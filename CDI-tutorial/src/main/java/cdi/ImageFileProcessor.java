package cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import cdi.editor.ImageFileEditor;
import cdi.qualifier.PngFileEditorQualifier;

public class ImageFileProcessor {
    
    public ImageFileProcessor() {
	}

	private ImageFileEditor imageFileEditor;
    private TimeLogger timeLogger;
    
    @Inject
    public ImageFileProcessor(@PngFileEditorQualifier ImageFileEditor imageFileEditor, TimeLogger timeLogger) {
        this.imageFileEditor = imageFileEditor;
        this.timeLogger = timeLogger;
    }
    
    public ImageFileEditor getImageFileditor() {
        return imageFileEditor;
    }
    
    public TimeLogger getTimeLogger() {
        return timeLogger;
    }
    
    public String openFile(String fileName) {
        return imageFileEditor.openFile(fileName) + " at: " + timeLogger.getTime();
    }
    
    public String editFile(String fileName) {
        return imageFileEditor.editFile(fileName) + " at: " + timeLogger.getTime();
    }
     
    public String writeFile(String fileName) {
        return imageFileEditor.writeFile(fileName) + " at: " + timeLogger.getTime();
    }
    
    public String saveFile(String fileName) {
        return imageFileEditor.saveFile(fileName)+ " at: " + timeLogger.getTime();
    }
}