/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
*/

package org.pentaho.pms.ui.concept.editor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.pentaho.pms.ui.util.Const;

public class Constants {

  // ~ Static fields/initializers ======================================================================================

  private static final Log logger = LogFactory.getLog(Constants.class);

  private static FontRegistry fontRegistry;

  private static ImageRegistry imageRegistry;

  // ~ Instance fields =================================================================================================

  // ~ Constructors ====================================================================================================

  // ~ Methods =========================================================================================================

  public static FontRegistry getFontRegistry(final Display display) {
    if (null == fontRegistry) {
      initFontRegistry(display);
    }
    return fontRegistry;
  }

  public static ImageRegistry getImageRegistry(final Display display) {
    if (null == imageRegistry) {
      initImageRegistry(display);
    }
    return imageRegistry;
  }

  private static void initFontRegistry(final Display display) {
    fontRegistry = new FontRegistry(display);
    fontRegistry.put("card-title", new FontData[] { new FontData("Tahoma", 10, SWT.BOLD) }); //$NON-NLS-1$ //$NON-NLS-2$
    fontRegistry.put("group-name", new FontData[] { new FontData("Tahoma", 12, SWT.BOLD) }); //$NON-NLS-1$ //$NON-NLS-2$
    fontRegistry.put("prop-mgmt-title", new FontData[] { new FontData("Tahoma", 10, SWT.BOLD) }); //$NON-NLS-1$ //$NON-NLS-2$
    fontRegistry.put("formula-editor-font", new FontData[] { new FontData("Courier New", 10, SWT.NORMAL) }); //$NON-NLS-1$ //$NON-NLS-2$
  }

  private static void initImageRegistry(final Display display) {
    imageRegistry = new ImageRegistry(display);
    imageRegistry.put("add-button", createImage(display, "child-property-add.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("del-button", createImage(display, "child-property-delete.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("override-button", createImage(display, "override.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("stop-override-button", createImage(display, "stop-override.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("concept-editor-app", createImage(display, "concept-editor.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("property-group", createImage(display, "folder.png")); //$NON-NLS-1$ //$NON-NLS-2$

    imageRegistry.put("parent-property", createImage(display, "parent-property.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("inherited-property", createImage(display, "inherited-property.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("security-property", createImage(display, "security-property.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("child-property", createImage(display, "child-property.png")); //$NON-NLS-1$ //$NON-NLS-2$

    imageRegistry.put("column-add-button", createImage(display, "column-add.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("column-del-button", createImage(display, "column-delete.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("show-id-button", createImage(display, "show-id.png")); //$NON-NLS-1$ //$NON-NLS-2$

    imageRegistry.put("concept-add-button", createImage(display, "concept-add.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("concept-del-button", createImage(display, "concept-delete.png")); //$NON-NLS-1$ //$NON-NLS-2$


    imageRegistry.put("column", createImage(display, "column.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("table", createImage(display, "table.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("concept", createImage(display, "concept.png")); //$NON-NLS-1$ //$NON-NLS-2$

    imageRegistry.put("add-arrow", createImage(display, "add.gif"));
    imageRegistry.put("add-all-arrow", createImage(display, "add_all.gif"));
    imageRegistry.put("remove-arrow", createImage(display, "remove.gif"));
    imageRegistry.put("remove-all-arrow", createImage(display, "remove_all.gif"));
    imageRegistry.put("pentaho-icon", createImage(display, "icon.png"));
    imageRegistry.put("bus-table-graph-icon", createImage(display, "business_table_lrg.png"));
    
    imageRegistry.put("role-icon", createImage(display, "group.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("user-icon", createImage(display, "user.png")); //$NON-NLS-1$ //$NON-NLS-2$
    
    imageRegistry.put("up-arrow", createImage(display, "arrow_up.png")); //$NON-NLS-1$ //$NON-NLS-2$
    imageRegistry.put("down-arrow", createImage(display, "arrow_down.png")); //$NON-NLS-1$ //$NON-NLS-2$

    imageRegistry.put("check", createImage(display, "check.png")); //$NON-NLS-1$ //$NON-NLS-2$
  }

  private static Image createImage(final Display display, final String filename) {
    return new Image(display, Constants.class.getResourceAsStream(Const.IMAGE_DIRECTORY + filename));
  }
}
