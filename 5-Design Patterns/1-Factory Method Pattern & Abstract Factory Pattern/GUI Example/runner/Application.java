package runner;

import factory.GuiFactory;
import factory.OsxFactory;
import factory.WinFactory;

/**
 * Main application that actually uses the concrete factories.
 *
 * @author Ziang Lu
 */
public class Application {

    /**
     * Main driver.
     * @param args arguments from command line
     */
    public void main(String[] args) {
        GuiFactory osxFactory = new OsxFactory();
        Renderer osxRenderer = new Renderer(osxFactory);
        osxRenderer.render();

        GuiFactory winFactory = new WinFactory();
        Renderer winRenderer = new Renderer(winFactory);
        winRenderer.render();
    }

}