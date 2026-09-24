package com.mbridge.msdk.setting.util;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.net.C13641a;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.util.a */
/* JADX INFO: compiled from: MraidJSController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13645a {

    /* JADX INFO: renamed from: b */
    private static final String f38119b = "/iphone|mac|ipad|ipod/i.test(window.navigator.userAgent.toLowerCase())&&(console={},console.log=function(e){var t=document.createElement(\"iframe\");t.setAttribute(\"src\",\"ios-log: \"+e),document.documentElement.appendChild(t),t.parentNode.removeChild(t),t=null},console.debug=console.info=console.warn=console.error=console.log),function(){var e=window.mraid={},t=window.navigator.userAgent.toLowerCase(),n=/iphone|mac|ipad|ipod/i.test(t),r=/android/i.test(t),i=window.mraidbridge={nativeSDKFiredReady:!1,nativeCallQueue:[],nativeCallInFlight:!1,lastSizeChangeProperties:null};function o(e){var t,i;N(s.INFO,\"靚��鍂�䲮瘜�:\"+e),n?(t=e,(i=document.createElement(\"iframe\")).setAttribute(\"frameborder\",\"0\"),i.style.cssText=\"width:0;height:0;border:0;display:none;\",i.setAttribute(\"src\",t),setTimeout(function(){document.body.appendChild(i)},5)):r&&window.prompt(e,\"mraid:\")}i.fireChangeEvent=function(e){for(var t in e){if(e.hasOwnProperty(t))(0,A[t])(e[t])}},i.nativeCallComplete=function(e){0!==this.nativeCallQueue.length?o(this.nativeCallQueue.pop()):this.nativeCallInFlight=!1},i.executeNativeCall=function(e){var t=e.shift();if(!this.nativeSDKFiredReady)return console.log(\"rejecting \"+t+\" because mraid is not ready\"),void i.notifyErrorEvent(\"mraid is not ready\",t);for(var n,r,a=\"mraid://\"+t,s=!0,u=0;u<e.length;u+=2)n=e[u],null!==(r=e[u+1])&&(s?(a+=\"?\",s=!1):a+=\"&\",a+=encodeURIComponent(n)+\"=\"+encodeURIComponent(r));this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,o(a))},i.setCurrentPosition=function(e,t,n,r){d={x:e,y:t,width:n,height:r},N(s.INFO,\"Set current position to \"+I(d))},i.setDefaultPosition=function(e,t,n,r){g={x:e,y:t,width:n,height:r},N(s.INFO,\"Set default position to \"+I(g))},i.setMaxSize=function(e,t){p={width:e,height:t},h.width=e,h.height=t,N(s.INFO,\"Set max size to \"+I(p))},i.setPlacementType=function(e){w=e,N(s.INFO,\"Set placement type to \"+I(w))},i.setScreenSize=function(e,t){m={width:e,height:t},N(s.INFO,\"Set screen size to \"+I(m))},i.setState=function(e){y=e,N(s.INFO,\"Set state to \"+I(y)),N(s.STATECHANGE,y)},i.setIsViewable=function(e){O=e,N(s.INFO,\"Set isViewable to \"+I(O)),N(s.VIEWABLECHANGE,O)},i.setSupports=function(e,t,n,r,i){f={sms:e,tel:t,calendar:n,storePicture:r,inlineVideo:i}},i.notifyReadyEvent=function(){this.nativeSDKFiredReady=!0,N(s.READY)},i.notifyErrorEvent=function(e,t){N(s.ERROR,e,t)},i.fireReadyEvent=i.notifyReadyEvent,i.fireErrorEvent=i.notifyErrorEvent,i.notifySizeChangeEvent=function(e,t){this.lastSizeChangeProperties&&e==this.lastSizeChangeProperties.width&&t==this.lastSizeChangeProperties.height||(this.lastSizeChangeProperties={width:e,height:t},N(s.SIZECHANGE,e,t))},i.notifyStateChangeEvent=function(){y===a.LOADING&&N(s.INFO,\"Native SDK initialized.\"),N(s.INFO,\"Set state to \"+I(y)),N(s.STATECHANGE,y)},i.notifyViewableChangeEvent=function(){N(s.INFO,\"Set isViewable to \"+I(O)),N(s.VIEWABLECHANGE,O)},i.audioVolumeChange=function(e){R=e,N(s.INFO,\"Set audioVolumeChange to \"+I(e)),N(s.AUDIOVOLUMECHANGE,R)};e.VERSION=\"3.0\";var a=e.STATES={LOADING:\"loading\",DEFAULT:\"default\",EXPANDED:\"expanded\",HIDDEN:\"hidden\",RESIZED:\"resized\"},s=e.EVENTS={ERROR:\"error\",INFO:\"info\",READY:\"ready\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\",SIZECHANGE:\"sizeChange\",AUDIOVOLUMECHANGE:\"audioVolumeChange\"},u=e.PLACEMENT_TYPES={UNKNOWN:\"unknown\",INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},h={width:!1,height:!1,useCustomClose:!1,isModal:!0},l={width:!1,height:!1,offsetX:!1,offsetY:!1,customClosePosition:\"top-right\",allowOffscreen:!0},c={allowOrientationChange:!0,forceOrientation:\"none\"},f={sms:!1,tel:!1,calendar:!1,storePicture:!1,inlineVideo:!1},p={},d={},g={},m={},v={},E={},R=\"\",y=a.LOADING,O=!1,w=u.UNKNOWN,C={major:0,minor:0,patch:0},N=function(){for(var e=new Array(arguments.length),t=arguments.length,n=0;n<t;n++)e[n]=arguments[n];var r=e.shift();v[r]&&v[r].broadcast(e)},S=function(e,t){for(var n in t)if(t[n]===e)return!0;return!1},I=function(e){if(\"object\"==typeof e){var t=[];if(e.push){for(var n in e)t.push(e[n]);return\"[\"+t.join(\",\")+\"]\"}for(var n in e)t.push(\"'\"+n+\"': \"+e[n]);return\"{\"+t.join(\",\")+\"}\"}return String(e)},A={state:function(e){y===a.LOADING&&N(s.INFO,\"Native SDK initialized.\"),y=e,N(s.INFO,\"Set state to \"+I(e)),N(s.STATECHANGE,y)},viewable:function(e){O=e,N(s.INFO,\"Set isViewable to \"+I(e)),N(s.VIEWABLECHANGE,O)},placementType:function(e){N(s.INFO,\"Set placementType to \"+I(e)),w=e},sizeChange:function(e){for(var t in N(s.INFO,\"Set screenSize to \"+I(e)),e)e.hasOwnProperty(t)&&(m[t]=e[t])},currentAppOrientation:function(e,t){E={orientation:e,locked:t},N(s.INFO,\"Set app orientation to \"+I(E))},supports:function(e){N(s.INFO,\"Set supports to \"+I(e)),f=e},hostSDKVersion:function(e){var t=e.split(\".\").map(function(e){return parseInt(e,10)}).filter(function(e){return e>=0});t.length>=3&&(C.major=parseInt(t[0],10),C.minor=parseInt(t[1],10),C.patch=parseInt(t[2],10),N(s.INFO,\"Set hostSDKVersion to \"+I(C)))}},P=function(e,t,n,r){if(!r){if(null===e)return N(s.ERROR,\"Required object not provided.\",n),!1;for(var i in t)if(t.hasOwnProperty(i)&&void 0===e[i])return N(s.ERROR,\"Object is missing required property: \"+i,n),!1}for(var o in e){var a=t[o],u=e[o];if(a&&!a(u))return N(s.ERROR,\"Value of property \"+o+\" is invalid: \"+u,n),!1}return!0},b={useCustomClose:function(e){return\"boolean\"==typeof e}};e.addEventListener=function(t,n){t&&n?S(t,s)?(v[t]||(v[t]=new function(t){this.event=t,this.count=0;var n={};this.add=function(e){var t=String(e);n[t]||(n[t]=e,this.count++)},this.remove=function(e){var t=String(e);return!!n[t]&&(n[t]=null,delete n[t],this.count--,!0)},this.removeAll=function(){for(var e in n)n.hasOwnProperty(e)&&this.remove(n[e])},this.broadcast=function(t){for(var r in n)n.hasOwnProperty(r)&&n[r].apply(e,t)},this.toString=function(){var e=[t,\":\"];for(var r in n)n.hasOwnProperty(r)&&e.push(\"|\",r,\"|\");return e.join(\"\")}}(t)),v[t].add(n)):N(s.ERROR,\"Unknown MRAID event: \"+t,\"addEventListener\"):N(s.ERROR,\"Both event and listener are required.\",\"addEventListener\")},e.close=function(){y===a.HIDDEN?N(s.ERROR,\"Ad cannot be closed when it is already hidden.\",\"close\"):i.executeNativeCall([\"close\"])},e.unload=function(){y===a.EXPANDED?N(s.ERROR,\"Ad cannot be unload when it is already EXPANDED.\",\"close\"):i.executeNativeCall([\"unload\"])},e.expand=function(e){if(this.getState()!==a.DEFAULT&&this.getState()!==a.RESIZED)N(s.ERROR,\"Ad can only be expanded from the default or resized state.\",\"expand\");else{var t=[\"expand\",\"shouldUseCustomClose\",!1];e&&(t=t.concat([\"url\",e])),i.executeNativeCall(t)}},e.getExpandProperties=function(){return{width:h.width,height:h.height,useCustomClose:h.useCustomClose,isModal:h.isModal}},e.getCurrentPosition=function(){return{x:d.x,y:d.y,width:d.width,height:d.height}},e.getDefaultPosition=function(){return{x:g.x,y:g.y,width:g.width,height:g.height}},e.getMaxSize=function(){return{width:p.width,height:p.height}},e.getPlacementType=function(){return w},e.getScreenSize=function(){return{width:m.width,height:m.height}},e.getState=function(){return y},e.isViewable=function(){return O},e.getVersion=function(){return e.VERSION},e.getCurrentAppOrientation=function(){return{orientation:E.orientation,locked:E.locked}},e.getAudioVolume=function(){return R},e.open=function(e){e?i.executeNativeCall([\"open\",\"url\",e]):N(s.ERROR,\"URL is required.\",\"open\")},e.removeEventListener=function(e,t){if(e){if(t){var n=!1;if(v[e]&&(n=v[e].remove(t)),!n)return void N(s.ERROR,\"Listener not currently registered for event.\",\"removeEventListener\")}else!t&&v[e]&&v[e].removeAll();v[e]&&0===v[e].count&&(v[e]=null,delete v[e])}else N(s.ERROR,\"Event is required.\",\"removeEventListener\")},e.setExpandProperties=function(e){P(e,b,\"setExpandProperties\",!0)&&e.hasOwnProperty(\"useCustomClose\")&&(h.useCustomClose=!1)},e.useCustomClose=function(e){},e.createCalendarEvent=function(e){D.initialize(e),D.parse()?i.executeNativeCall(D.arguments):N(s.ERROR,D.errors[0],\"createCalendarEvent\")},e.supports=function(e){return f[e]},e.playVideo=function(t){e.isViewable()?t?i.executeNativeCall([\"playVideo\",\"uri\",t]):N(s.ERROR,\"playVideo must be called with a valid URI\",\"playVideo\"):N(s.ERROR,\"playVideo cannot be called until the ad is viewable\",\"playVideo\")},e.storePicture=function(t){e.isViewable()?t?i.executeNativeCall([\"storePicture\",\"uri\",t]):N(s.ERROR,\"storePicture must be called with a valid URI\",\"storePicture\"):N(s.ERROR,\"storePicture cannot be called until the ad is viewable\",\"storePicture\")};var V={width:function(e){return!isNaN(e)&&e>0},height:function(e){return!isNaN(e)&&e>0},offsetX:function(e){return!isNaN(e)},offsetY:function(e){return!isNaN(e)},customClosePosition:function(e){return\"string\"==typeof e&&[\"top-right\",\"bottom-right\",\"top-left\",\"bottom-left\",\"center\",\"top-center\",\"bottom-center\"].indexOf(e)>-1},allowOffscreen:function(e){return\"boolean\"==typeof e}};e.setOrientationProperties=function(e){e.hasOwnProperty(\"allowOrientationChange\")&&(c.allowOrientationChange=e.allowOrientationChange),e.hasOwnProperty(\"forceOrientation\")&&(c.forceOrientation=e.forceOrientation);var t=[\"setOrientationProperties\",\"allowOrientationChange\",c.allowOrientationChange,\"forceOrientation\",c.forceOrientation];i.executeNativeCall(t)},e.getOrientationProperties=function(){return{allowOrientationChange:c.allowOrientationChange,forceOrientation:c.forceOrientation}},e.resize=function(){if(this.getState()!==a.DEFAULT&&this.getState()!==a.RESIZED)N(s.ERROR,\"Ad can only be resized from the default or resized state.\",\"resize\");else if(l.width&&l.height){var e=[\"resize\",\"width\",l.width,\"height\",l.height,\"offsetX\",l.offsetX||0,\"offsetY\",l.offsetY||0,\"customClosePosition\",l.customClosePosition,\"allowOffscreen\",!!l.allowOffscreen];i.executeNativeCall(e)}else N(s.ERROR,\"Must set resize properties before calling resize()\",\"resize\")},e.getResizeProperties=function(){return{width:l.width,height:l.height,offsetX:l.offsetX,offsetY:l.offsetY,customClosePosition:l.customClosePosition,allowOffscreen:l.allowOffscreen}},e.setResizeProperties=function(e){if(P(e,V,\"setResizeProperties\",!0))for(var t=[\"width\",\"height\",\"offsetX\",\"offsetY\",\"customClosePosition\",\"allowOffscreen\"],n=t.length,r=0;r<n;r++){var i=t[r];e.hasOwnProperty(i)&&(l[i]=e[i])}},e.getHostSDKVersion=function(){return C};var D={initialize:function(e){this.parameters=e,this.errors=[],this.arguments=[\"createCalendarEvent\"]},parse:function(){this.parameters?(this.parseDescription(),this.parseLocation(),this.parseSummary(),this.parseStartAndEndDates(),this.parseReminder(),this.parseRecurrence(),this.parseTransparency()):this.errors.push(\"The object passed to createCalendarEvent cannot be null.\");var e=this.errors.length;return e&&(this.arguments.length=0),0===e},parseDescription:function(){this._processStringValue(\"description\")},parseLocation:function(){this._processStringValue(\"location\")},parseSummary:function(){this._processStringValue(\"summary\")},parseStartAndEndDates:function(){this._processDateValue(\"start\"),this._processDateValue(\"end\")},parseReminder:function(){var e=this._getParameter(\"reminder\");e&&(e<0?(this.arguments.push(\"relativeReminder\"),this.arguments.push(parseInt(e)/1e3)):(this.arguments.push(\"absoluteReminder\"),this.arguments.push(e)))},parseRecurrence:function(){var e=this._getParameter(\"recurrence\");e&&(this.parseRecurrenceInterval(e),this.parseRecurrenceFrequency(e),this.parseRecurrenceEndDate(e),this.parseRecurrenceArrayValue(e,\"daysInWeek\"),this.parseRecurrenceArrayValue(e,\"daysInMonth\"),this.parseRecurrenceArrayValue(e,\"daysInYear\"),this.parseRecurrenceArrayValue(e,\"monthsInYear\"))},parseTransparency:function(){if(this.parameters.hasOwnProperty(\"transparency\")){var e=this.parameters.transparency;S(e,[\"opaque\",\"transparent\"])?(this.arguments.push(\"transparency\"),this.arguments.push(e)):this.errors.push(\"transparency must be opaque or transparent\")}},parseRecurrenceArrayValue:function(e,t){if(e.hasOwnProperty(t)){var n=e[t];if(n&&n instanceof Array){var r=n.join(\",\");this.arguments.push(t),this.arguments.push(r)}else this.errors.push(t+\" must be an array.\")}},parseRecurrenceInterval:function(e){if(e.hasOwnProperty(\"interval\")){var t=e.interval;t?(this.arguments.push(\"interval\"),this.arguments.push(t)):this.errors.push(\"Recurrence interval cannot be null.\")}else this.arguments.push(\"interval\"),this.arguments.push(1)},parseRecurrenceFrequency:function(e){if(e.hasOwnProperty(\"frequency\")){var t=e.frequency;S(t,[\"daily\",\"weekly\",\"monthly\",\"yearly\"])?(this.arguments.push(\"frequency\"),this.arguments.push(t)):this.errors.push('Recurrence frequency must be one of: \"daily\", \"weekly\", \"monthly\", \"yearly\".')}},parseRecurrenceEndDate:function(e){var t=e.expires;t&&(this.arguments.push(\"expires\"),this.arguments.push(t))},_getParameter:function(e){return this.parameters.hasOwnProperty(e)?this.parameters[e]:null},_processStringValue:function(e){if(this.parameters.hasOwnProperty(e)){var t=this.parameters[e];this.arguments.push(e),this.arguments.push(t)}},_processDateValue:function(e){if(this.parameters.hasOwnProperty(e)){var t=this._getParameter(e);this.arguments.push(e),this.arguments.push(t)}}}}();".replaceAll("(?m)^\\s+", "").replaceAll("(?m)^//.*(?=\\n)", "");

    /* JADX INFO: renamed from: c */
    private static volatile C13645a f38120c;

    /* JADX INFO: renamed from: a */
    private String f38121a;

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.util.a$a */
    /* JADX INFO: compiled from: MraidJSController.java */
    class a extends AbstractC13115a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f38122b;

        a(String str) {
            this.f38122b = str;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: a */
        public void mo37204a(String str) {
            C13219q0.m37813a("MraidJSController", "fail request mraid js. " + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: b */
        public void mo37205b(String str) {
            C13219q0.m37813a("MraidJSController", "request mraid js success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C13645a.this.f38121a = str;
            C13645a.this.m39761a(str, this.f38122b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.util.a$b */
    /* JADX INFO: compiled from: MraidJSController.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f38124a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f38125b;

        b(String str, String str2) {
            this.f38124a = str;
            this.f38125b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER), "mraid_js.txt");
                if (file.exists()) {
                    file.delete();
                }
                C13215o0.m37795a(this.f38124a.getBytes(), file);
                C12998a.m36460b().m36464a("MraidJSController", this.f38125b);
            } catch (Exception e) {
                C13219q0.m37813a("MraidJSController", e.getMessage());
            }
        }
    }

    private C13645a() {
    }

    /* JADX INFO: renamed from: a */
    public static C13645a m39758a() {
        if (f38120c == null) {
            synchronized (C13645a.class) {
                if (f38120c == null) {
                    f38120c = new C13645a();
                }
            }
        }
        return f38120c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39761a(String str, String str2) {
        new Thread(new b(str, str2)).start();
    }

    /* JADX INFO: renamed from: c */
    private String m39762c() {
        try {
            File file = new File(C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER), "mraid_js.txt");
            return (file.exists() && file.canRead()) ? C13215o0.m37805e(file) : "";
        } catch (Exception e) {
            C13219q0.m37813a("MraidJSController", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39763a(Context context, String str) {
        if (context == null) {
            return;
        }
        String strM36462a = C12998a.m36460b().m36462a("MraidJSController");
        if (TextUtils.isEmpty(strM36462a) || !strM36462a.equals(str)) {
            try {
                new C13641a(context).get(0, str, (C13126e) null, new a(str), "mraid_js", 60000L);
            } catch (Exception e) {
                C13219q0.m37816b("MraidJSController", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m39764b() {
        try {
            if (TextUtils.isEmpty(this.f38121a)) {
                this.f38121a = m39762c();
            }
            if (!TextUtils.isEmpty(this.f38121a)) {
                return this.f38121a;
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null && !TextUtils.isEmpty(c13635gM39718d.m39434P())) {
                m39763a(C13008c.m36588n().m36542d(), c13635gM39718d.m39434P());
            }
            return f38119b;
        } catch (Exception unused) {
            return f38119b;
        }
    }
}
