/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.parse;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Parse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ParsePtr extends Ptr<Parse, ParsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Parse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Parse() {}
    protected Parse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setApplicationId:clientKey:")
    public static native void initialize(String applicationId, String clientKey);
    @Method(selector = "getApplicationId")
    public static native String getApplicationId();
    @Method(selector = "getClientKey")
    public static native String getClientKey();
    @Method(selector = "enableLocalDatastore")
    public static native void enableLocalDatastore();
    @Method(selector = "isLocalDatastoreEnabled")
    public static native boolean isLocalDatastoreEnabled();
    @Method(selector = "enableDataSharingWithApplicationGroupIdentifier:")
    public static native void enableDataSharing(String groupIdentifier);
    @Method(selector = "enableDataSharingWithApplicationGroupIdentifier:containingApplication:")
    public static native void enableDataSharing(String groupIdentifier, String bundleIdentifier);
    @Method(selector = "applicationGroupIdentifierForDataSharing")
    public static native String getApplicationGroupIdentifierForDataSharing();
    @Method(selector = "containingApplicationBundleIdentifierForDataSharing")
    public static native String getContainingApplicationBundleIdentifierForDataSharing();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(PFLogLevel logLevel);
    @Method(selector = "logLevel")
    public static native PFLogLevel getLogLevel();
    /*</methods>*/
}
