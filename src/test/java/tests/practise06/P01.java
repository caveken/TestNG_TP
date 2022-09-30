package tests.practise06;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        // Fill in capitals by country.

    @Test
    public void test01() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();
        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(dhtmlgoodiesPage.oslo,dhtmlgoodiesPage.norway)
                .dragAndDrop(dhtmlgoodiesPage.stockholm,dhtmlgoodiesPage.sweden)
                .dragAndDrop(dhtmlgoodiesPage.washington,dhtmlgoodiesPage.unitedStates)
                .dragAndDrop(dhtmlgoodiesPage.copenhagen,dhtmlgoodiesPage.denmark)
                .dragAndDrop(dhtmlgoodiesPage.seoul,dhtmlgoodiesPage.southKorea)
                .dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.italy)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();

        Driver.closeDriver();

}}
