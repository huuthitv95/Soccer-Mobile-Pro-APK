package androidx.media3.common.util;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.AudioFocusRequest;
import android.media.MediaCodec;
import android.media.session.MediaSessionManager;
import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputContentInfo;
import java.util.Map;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Util$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException m308m(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AudioFocusRequest.Builder m313m(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AudioFocusRequest.Builder m317m(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AudioFocusRequest m319m(Object obj) {
        return (AudioFocusRequest) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m320m(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m323m(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ HttpEngine m325m(Object obj) {
        return (HttpEngine) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ NetworkException m326m(Object obj) {
        return (NetworkException) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ UrlResponseInfo m334m(Object obj) {
        return (UrlResponseInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m338m(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AutofillId m340m(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m341m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ InputContentInfo m342m(Object obj) {
        return (InputContentInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m355m() {
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m374m(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m43612m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof NetworkException;
    }
}
