/*
 * Copyright (C) 2008-2012 Open Wide SA
 *
 * This program is FREE software. You can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your opinion) any later version.
 *
 * This program is distributed in the HOPE that it will be USEFUL,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, write to the Free Software Foundation,
 * Inc. ,59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * 
 * More information at http://knowledge.openwide.fr/bin/view/Main/AlfrescoETLConnector/
 *
 */
package fr.openwide.talendalfresco.rest.server;

/**
 * REST Exception
 * 
 * @author Marc Dutoo - Open Wide SA
 *
 */
public class RestRuntimeException extends RuntimeException {
   private static final long serialVersionUID = 5327010463056166395L;

   public RestRuntimeException(String message, Throwable cause) {
      super(message, cause);
   }

   public RestRuntimeException(String message) {
      super(message);
   }

}
