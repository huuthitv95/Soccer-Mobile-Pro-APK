package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.exoplayer.video.DummySurface;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.InterfaceC11669Sd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.10 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C435610 extends AbstractC43981g {
    public static boolean A0z;
    public static boolean A10;
    public static byte[] A11;
    public static String[] A12 = {"1NrdYD1", "e5CK9xPn181JbTmOtknpsRCTtEnfDjR7", "JOO2xDl09pGw2ctw4YX5NjUR9G0o3YSd", "78GGNN1Oy", "9AKZq2G4NCUeKdGegrXYJ0IAO08zLsd4", "iWBlsDv", "UMYjsOFgfK8VKq5PmkWlrwAU0Drwgr0y", "VHiTYYEOZZ1JgajrOOPlCJmFeSyZZTnO"};
    public static final int[] A13;
    public C7275n5 A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public MediaFormat A0S;
    public Surface A0T;
    public Surface A0U;
    public C7425pW A0V;
    public C5246Fm A0W;
    public InterfaceC5262G2 A0X;
    public Object A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D69547806: Only become ready once we have a surface")
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final long A0p;
    public final Context A0q;
    public final C5248Fo A0r;
    public final C5267G7 A0s;
    public final C5270GA A0t;
    public final C5285GP A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final long[] A0x;
    public final long[] A0y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Point A07(C4956B3 c4956b3, C7472qI c7472qI) throws C4986BX {
        boolean z = c7472qI.A0A > c7472qI.A0L;
        int i = z ? c7472qI.A0A : c7472qI.A0L;
        int i2 = z ? c7472qI.A0L : c7472qI.A0A;
        float f = i2 / i;
        for (int i3 : A13) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (AbstractC46115C.A02 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point pointA0N = c4956b3.A0N(i5, i3);
                if (c4956b3.A0R(pointA0N.x, pointA0N.y, c7472qI.A01)) {
                    return pointA0N;
                }
            } else {
                int iA05 = AbstractC46115C.A05(i3, 16) * 16;
                int iA06 = AbstractC46115C.A05(i4, 16) * 16;
                if (iA05 * iA06 <= C4989Ba.A00()) {
                    int i6 = z ? iA06 : iA05;
                    if (!z) {
                        iA05 = iA06;
                    }
                    return new Point(i6, iA05);
                }
            }
        }
        return null;
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A11, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A11 = new byte[]{96, 101, 95, 96, 96, 102, 96, 98, 92, 98, 92, 95, -64, -80, -81, -84, -74, -81, -59, -74, -90, -91, -94, -84, -91, -63, -106, -122, -117, -123, -122, 79, SignedBytes.MAX_POWER_OF_TWO, 62, 63, 68, 111, 66, 62, 88, 78, 71, 71, 71, 68, 120, -113, -123, 126, 126, 126, -66, -70, -61, -63, -122, 124, 117, 118, 117, -90, 121, 125, 105, 95, 88, 90, 88, -119, 92, 96, -77, -72, -58, -77, 93, 98, 112, 106, -123, -105, -103, -105, -93, -100, 116, 116, -123, -120, 99, 117, 119, 117, -127, 122, 82, 82, 99, 102, 99, 95, 113, 115, 113, 125, 118, 78, 78, 95, 98, 97, 78, 96, 98, 96, 108, 101, Base64.padSymbol, Base64.padSymbol, 78, 81, 108, 63, -121, -76, -86, -72, -75, -77, -89, -66, 102, -121, 120, 124, -119, 122, -114, 78, 126, -126, 110, 93, 124, -124, 114, 127, 90, -71, -21, -19, -21, -41, -46, -70, -83, -88, -88, -61, -60, -76, -24, -27, -44, -46, -63, -30, -25, -40, -46, -91, -65, -55, -66, -64, -56, -86, -82, -43, -67, -51, -68, -47, -60, -68, -101, -81, -58, -101, -83, -85, -84, -80, 127, -113, 126, -109, -122, 126, -100, 126, -111, -109, 111, -108, -92, -109, -88, -101, -109, -79, -109, -90, -88, -123, -79, -122, -99, -89, -107, -123, -110, 122, 120, 121, 120, -95, -117, 114, 116, 118, -125, 123, 100, 105, 99, 108, 106, 119, -128, 95, 90, -122, 112, 87, 87, 85, -127, 118, 119, 117, 50, 127, 115, -118, 50, -124, 119, -123, -127, 126, -121, -122, 123, -127, -128, 50, 115, 118, 124, -121, -123, -122, 119, 118, 50, -122, -127, 76, 50, -71, -27, -29, -33, -27, -55, -89, -126, 114, 115, 113, 112, -103, -96, -87, -101, -107, -77, -107, -121, -77, -92, -58, -61, -59, -52, -43, -57, -63, -33, -50, -17, -12, -27, -54, -47, -38, -52, -58, -28, -43, -9, -18, -14, 77, 84, 93, 79, 73, 103, 90, 105, -127, 103, 96, -93, -44, -61, -48, -79, -46, -65, -48, -67, -79, -62, -81, -83, -83, -83, -76, -95, -97, -97, -95, 111, 92, 90, 90, 95, 90, 71, 70, 69, 69, 78, 59, 58, 57, 59, -106, -125, -126, -127, -123, 84, 65, 65, 63, 63, -107, -80, -69, -62, -76, -110, -73, -76, -78, -70, 111, -86, -69, -76, -74, -80, -78, -56, -107, -63, -80, -68, -76, -94, -72, -55, -76, 123, 111, 94, 96, 102, 101, 92, 92, 118, 94, 89, 99, 78, 74, 77, 71, -98, -96, -90, -91, -100, -100, -74, -86, -82, -82, -120, -115, -121, -112, -91, -89, -83, -84, -93, -93, -67, -79, -75, -75, -113, -108, -112, -107, 101, 103, 109, 108, 99, 99, 125, 113, 117, 117, 79, 84, 81, 79, -113, -111, -105, -106, -115, -115, -89, -97, -118, -108, 125, 127, 120, -128, 102, 104, 110, 109, 100, 100, 126, 118, 97, 107, 86, 82, 85, 84, -118, -116, -110, -111, -120, -120, -94, -102, -123, -113, 122, 120, 116, 124, -105, -71, -97, -98, -107, -107, -81, -109, -110, -100, -121, -123, -127, -125, -104, -70, -96, -97, -106, -106, -80, -104, -109, -99, -120, -124, -126, -118, 99, 112, 92, 114, 96, 100, 59, 105, 115, 111, 72, 103, 77, 84, 114, -127, 108, 118, 120, 87, 114, -125, -110, 126, 124, -120, 104, -125, 81, 96, 78, 86, 85, -97, -82, -83, -91, -86, -124, -97, -109, -94, -94, -116, -98, 120, -109, -89, -52, -60, -57, -52, -57, -42, -117, -74, -109, -107, -112, 93, 90, 109, -81, -72, -77, -110, -79, -105, -106, -70, -92, -97, -48, -93, -97, 103, 98, 72, 102, 79, 78, 75, 122, 117, 91, 123, 96, 99, 94, 99, 106, 68, 76, 71, 72, 78, -69, -44, -35, -34, -27, -34, -113, -80, -95, -97, -96, -91, -47, -94, -97, 125, -106, -97, -96, -89, -96, 81, 124, 98, 97, -110, 101, 97, -56, -31, -22, -21, -14, -21, -100, -57, -76, 117, 93, -117, 118, 110, 114, -125, 126, -120, 118, 94, 103, 114, 80, 84, 108, 107, 112, 104, 74, 118, 107, 108, 106, 93, 112, 107, 108, 118, 89, 108, 117, 107, 108, 121, 108, 121, -90, -56, -51, -56, -98, -117, -127, -115, -96, -122, -91, -83, -98, -126, 125, -97, -92, -97, 119, 99, -83, -75, -88, -93, -88, -96, 85, 95, 60, 59, 56, 81, -99, -89, -124, -122, -126, -103, -109, -111, -100, 114, -85, -77, -77, -85, -80, -87, -85, -54, -63, -84, -56, -47, -49, -111, -80, -51, -77, -75, -82, 126, 102, 99, 91, 77, Base64.padSymbol, 56, 65, 66, 59, 88, 118, 109, 116, 91, 88, 94, -88, -97, -90, -114, -119, -120, -125, 122, -127, 105, 100, 100, -76, -80, -87, 121, 123, 120, 96, 124, -71, -47, -54, -41, -35, -40, -42, -97, -107, -82, -67, -86, -79, 101, -91, -66, -51, -66, -119, -126, -116, -76, -120, -100, -81, -56, -41, -56, -108, -116, -112, -113, -66, -109, -90, 123, 93, 95, 90, -69, -98, -100, -96, -102, -103, 124, 122, 127, 107, 78, 77, 75, 74, -126, 102, 124, 120, 92, 97, -125, 112, -118, -128, -123, -116, 101, -50, -31, -32, -23, -27, -100, -80, -44, -79, -60, -61, -52, -56, 127, -83, -50, -45, -60, 127, -111, 113, -124, -125, -116, -120, 63, 109, -114, -109, -124, 63, 82, -105, -86, -77, -87, -86, -73, 101, -76, -70, -71, -75, -70, -71, 101, -85, -90, -82, -79, -86, -87, -78, -59, -45, -49, -52, -43, -44, -55, -49, -50, -45, -128, -43, -50, -53, -50, -49, -41, -50, -114, -128, -93, -49, -60, -59, -61, -128, -51, -63, -40, -128, -46, -59, -45, -49, -52, -43, -44, -55, -49, -50, -102, -128, -119, -125, 99, 125, 111, 105, 107, 102, -90, -96, -128, -99, -123, -125, -125, -102, -88, -83, -89, -121, -92, -116, -118, -118, -89, -118, -124, 100, -123, 112, 104, 103, -119, 107, 126, -128, 
        114, 108, 125, 75, 126, 100, -62, -59, -65, -100, -77, -61, -59, -96, -92, 118, -113, -124, -105, -120, -126, 115, -107, -110, -42, -14, -15, -4, -93, -41, -28, -27, -17, -24, -9, -93, -42, 126, 108, 93, 87, 97, 93, 90, 112, 126, 108, 93, 87, 97, 93, 90, -126, -72, -90, -105, -111, -100, -103, -108, -86, -116, 122, 107, 101, 112, 109, 104, -123, -77, -50, -50, 127, -52, -64, -51, -40, 127, -46, -45, -47, -60, -64, -52, 127, -62, -57, -64, -51, -58, -60, -46, -117, 127, -46, -50, 127, -61, -47, -50, -49, -49, -56, -51, -58, 127, -50, -59, -59, -46, -60, -45, -103, 127, -89, -126, 107, 71, 72, 92, 87, 112, 79, 117, 114, 87, 87, 79, -73, -110, -66, -89, -86, 97, 78, 59, 97, -38, -42, -77, -72, -72, -75, -82, -123, -122, -77, -92, -90, -93, -90, -124, 124, -92, -83, 112, -85, -101, -81, -98, -93, -87, 103, -83, -97, -83, -83, -93, -87, -88, 103, -93, -98, 120, -116, -117, -122, 68, 125, -119, 122, -92, 115, 111, -94, -81, -91, -77, -80, -86, -91, 111, -94, -73, 114, 110, -91, -94, -73, 114, -91, 111, -91, -90, -92, -80, -91, -90, -77, -24, -9, -12, -11, -78, -25, -12, -7, -7, -12, -14, 108, 123, 120, 121, 54, 117, 110, 111, 125, -48, -33, -36, -35, -102, -33, -42, -44, -43, -31, -95, -80, -83, -82, 107, -78, -83, -82, -28, -9, -78, 110, -127, 62, -51, -54, -41, -48, -54, -43, -52, -51, -54, -23, -9, -12, -11, -37, -18, -23, -22, -12, -57, -6, -21, -21, -22, -9, 114, 120, 123, -60, -51, -47, -46, -61, -48, -38, -26, -43, -31, -39, -95, -26, -43, -24, -39, -53, -38, -52, -38, -55, -44, -53, -56, -56, -53, -48, -72, -75, -71, -73, -72, -60, -65, -53, -70, -74, -68, -116, -115, -60, -61, -74, -69, -53, -52, -61, -81, -66, -120, -109, -116, 116, -113, -94, 114, 105, 108, 106, 115, 108, 107, 118, 118, 66, 65, Base64.padSymbol, 63, 105, 67, 66, 58, SignedBytes.MAX_POWER_OF_TWO, -46, -37, -46, -36, -97, -103, -52, -41, -56, -49, -62, -74, -105, -108, -104, 96, -90, -102, -94, -109, -105, -100, -95, -95, -105, -86, -101, -101, 100, 99, 101, 95, 120, 113, 107, -124, 66, -65, -62, -54, -128, -65, -76, -57, -72, -63, -74, -52, -56, -115, 123, -55, -54, -49, -64, 125, 113, 126, 126, 121, 126, 119, -17, -29, -12, -21, -16, -15, -31, -24, -115, -127, -104, 77, -120, -123, -119, -121, -120, -108, -27, -39, -16, -91, -31, -26, -24, -19, -20, -91, -21, -31, -14, -35, 117, 105, -128, 53, 127, 113, 108, 124, 112, 124, 119, -75, -79, -84, -73, -57, -61, -57, -65, -102, -115, -103, -115, -96, -108, -110, -115, -121, -113, -112, -123, -103, -105, -125, -118, -89, 105, 104, 105, -113, -128, -115, -124, -117, -117, 126, -125, -74, -89, -76, -85, -78, -78, -91, -86, -78, -18, -33, -20, -29, -22, -22, -35, -30, -15, -91, -106, -93, -102, -95, -95, -108, -103, -87, -24, -22, -31, -25, -22, -31, -20, -15, -84, -97, -90, -97, -101, -83, -97, -119, -81, -82, -86, -81, -82, 124, -81, -96, -96, -97, -84, -128, 125, -126, 111, -126, 119, 125, 124, 59, 114, 115, 117, -128, 115, 115, -127, -107, 91, 82, 87, -102, 82, 83, 90, -58, -76, -63, -57, -62, -63, -68, -105, -113, -115, -108, 122, -115, -120, -119, -109, 102, -103, -118, -118, -119, -106, -14, -33, -25, -30, -19, -35, -16, -19, -11, -119, 120, -127, 116, 122, -118, -84, -83, -90, -90, -99, -92, -99, -100, 101, -88, -92, -103, -79, -102, -103, -101, -93, -90, -107, -94, -98, -107, -107, -113, 125, 101, -54, -67, -72, -71, -61, -125, -121, -69, -60, -60, -86, -99, -104, -103, -93, 99, -107, -86, 100, 101, -40, -53, -58, -57, -47, -111, -61, -40, -59, -124, 119, 114, 115, 125, Base64.padSymbol, 114, 125, 122, 112, -121, 59, -124, 119, -127, 119, 125, 124, -37, -50, -55, -54, -44, -108, -51, -54, -37, -56, -109, -122, -127, -126, -116, 76, -118, -115, 81, -109, 74, -126, -112, -33, -46, -51, -50, -40, -104, -31, -106, -33, -41, -51, -105, -40, -41, -101, -105, -33, -39, -95, -22, -35, -40, -39, -29, -93, -20, -95, -22, -30, -40, -94, -29, -30, -90, -94, -22, -28, -83, -76, -98, -79, -80, -84, -85, -42, -57, -40, -47, -60, -61, -51, -65, -70, -54, -66, -88, -96, -96, -107, -92, -112, -105, -89, -97, -97, -108, -93, -113, -106, -98, -45};
    }

    static {
        A0P();
        A13 = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D69547806: Only become ready once we have a surface")
    public C435610(Context context, C7066jQ c7066jQ, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, InterfaceC4982BT interfaceC4982BT, long j, InterfaceC4897A6 interfaceC4897A6, boolean z, boolean z2, Handler handler, InterfaceC5286GQ interfaceC5286GQ, int i, int i2, int i3, int i4, int i5) {
        super(2, c7066jQ, mediaCodecRendererMetaParameters, interfaceC4982BT, interfaceC4897A6, z, z2, i3, i4);
        this.A0e = true;
        this.A0Z = true;
        boolean z3 = false;
        this.A0f = false;
        this.A0K = -9223372036854775807L;
        this.A0c = false;
        this.A0h = false;
        this.A0w = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A1v);
        this.A0h = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A0w);
        this.A0p = j;
        this.A0l = i;
        this.A0m = i2;
        this.A0q = context.getApplicationContext();
        this.A0n = i5;
        this.A0t = new C5270GA(context);
        this.A0s = new C5267G7(this.A0q);
        this.A0u = new C5285GP(handler, interfaceC5286GQ);
        this.A0r = new C5248Fo(this.A0s, this, this.A0w);
        this.A0v = A0i();
        if (AbstractC46115C.A02 == 29 && AbstractC46115C.A06.startsWith(A0B(811, 6, 62))) {
            z3 = true;
        }
        this.A0a = z3;
        this.A0x = new long[10];
        this.A0y = new long[10];
        this.A0R = -9223372036854775807L;
        this.A0O = -9223372036854775807L;
        this.A0M = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0H = 1;
        A0F();
    }

    private int A00(C7472qI c7472qI) {
        if (c7472qI.A0B != -1) {
            int i = 0;
            int i2 = c7472qI.A0X.size();
            for (int initializationDataCount = 0; initializationDataCount < i2; initializationDataCount++) {
                int totalInitializationDataSize = c7472qI.A0X.get(initializationDataCount).length;
                i += totalInitializationDataSize;
            }
            int totalInitializationDataSize2 = c7472qI.A0B;
            return totalInitializationDataSize2 + i;
        }
        int i3 = c7472qI.A0L;
        String str = c7472qI.A0W;
        int width = c7472qI.A0A;
        return A02(str, i3, width);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    public static int A01(InterfaceC4982BT interfaceC4982BT, C7472qI c7472qI, boolean z) throws C4986BX {
        int i;
        String mimeType = c7472qI.A0W;
        int adaptiveSupport = 0;
        if (!AbstractC44953J.A0F(mimeType)) {
            return 0;
        }
        boolean decoderCapable = true;
        boolean requiresSecureDecryption = c7472qI.A0O != null;
        String mimeType2 = c7472qI.A0W;
        List<C4956B3> listA7o = interfaceC4982BT.A7o(mimeType2, requiresSecureDecryption, false);
        if (listA7o.isEmpty() && z) {
            listA7o = A0C(interfaceC4982BT, c7472qI);
        }
        if (requiresSecureDecryption && listA7o.isEmpty()) {
            if (!requiresSecureDecryption) {
                return 1;
            }
            String mimeType3 = c7472qI.A0W;
            if (interfaceC4982BT.A7o(mimeType3, false, false).isEmpty()) {
                return 1;
            }
            return 2;
        }
        if (listA7o.isEmpty()) {
            return AbstractC47677i.A00(1);
        }
        if (!AbstractC43981g.A1G(c7472qI)) {
            return AbstractC47677i.A00(2);
        }
        C4956B3 c4956b3 = listA7o.get(0);
        boolean zA0S = c4956b3.A0S(c7472qI);
        if (zA0S && c7472qI.A0L > 0 && c7472qI.A0A > 0) {
            int i2 = AbstractC46115C.A02;
            String mimeType4 = A12[3];
            if (mimeType4.length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A12;
            strArr[4] = "IH389xfTqQddwzM1XHaKnp7MZCz6cb7i";
            strArr[7] = "af13jltpF5ZHHZjQxHJ609Zz958wUZpm";
            if (i2 >= 21) {
                zA0S = c4956b3.A0R(c7472qI.A0L, c7472qI.A0A, c7472qI.A01);
            } else {
                int i3 = c7472qI.A0L * c7472qI.A0A;
                int iA00 = C4989Ba.A00();
                String mimeType5 = A12[3];
                if (mimeType5.length() != 21) {
                    A12[6] = "ecceu4zvNIhSM2cVW4sHEkLyyuMr8ggY";
                    if (i3 > iA00) {
                        decoderCapable = false;
                    }
                } else {
                    String[] strArr2 = A12;
                    strArr2[4] = "Kv9mbenvGpQB93bFl6W05JZGB7qp372O";
                    strArr2[7] = "bO17OsYGhLw9DTwpfBLbbIHXKJZDjwiV";
                    if (i3 > iA00) {
                        decoderCapable = false;
                    }
                }
                zA0S = decoderCapable;
                if (!zA0S) {
                    StringBuilder sb = new StringBuilder();
                    String mimeType6 = A0B(380, 29, 72);
                    StringBuilder sbAppend = sb.append(mimeType6).append(c7472qI.A0L);
                    String mimeType7 = A0B(1775, 1, 84);
                    StringBuilder sbAppend2 = sbAppend.append(mimeType7).append(c7472qI.A0A);
                    String mimeType8 = A0B(1154, 3, 73);
                    StringBuilder sbAppend3 = sbAppend2.append(mimeType8);
                    String mimeType9 = AbstractC46115C.A04;
                    StringBuilder sbAppend4 = sbAppend3.append(mimeType9);
                    String mimeType10 = A0B(1153, 1, 64);
                    String string = sbAppend4.append(mimeType10).toString();
                    String mimeType11 = A0B(682, 23, 0);
                    AbstractC45794g.A04(mimeType11, string);
                }
            }
        }
        boolean z2 = c4956b3.A04;
        if (A12[2].charAt(6) != 'n') {
            A12[3] = "9b4CG0tnJeiPU0k4PARWVGoy4qv";
            if (z2) {
                i = 16;
            } else {
                i = 8;
            }
        } else if (z2) {
            i = 16;
        } else {
            i = 8;
        }
        boolean requiresSecureDecryption2 = c4956b3.A08;
        String[] strArr3 = A12;
        if (strArr3[4].charAt(23) != strArr3[7].charAt(23)) {
            A12[6] = "WfKDcH5FGJ5C30XN1qoZOnsI3qPSaUZa";
            if (requiresSecureDecryption2) {
                adaptiveSupport = 32;
            }
        } else if (requiresSecureDecryption2) {
            adaptiveSupport = 32;
        }
        return i | adaptiveSupport | (zA0S ? 4 : 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0011 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:8:0x000d  */
    public static int A02(String str, int i, int i2) {
        byte b;
        int iA05;
        int maxPixels;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(A0B(1635, 10, 77))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio = iA05 * 3;
                return minCompressionRatio / (maxPixels * 2);
            case -1662541442:
                if (A12[6].charAt(29) != 'x') {
                    String[] strArr = A12;
                    strArr[4] = "tnE0zKFGRA1mCoLoHHoslqD8Jr5mgPU8";
                    strArr[7] = "qP878wwRxP7hWQjb5gRcbhQ3e4xfipWz";
                    if (str.equals(A0B(1682, 10, 94))) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                } else {
                    A12[6] = "kyKsBwQU8xCkRSkCaxSqqZifTpXgRXEu";
                    if (str.equals(A0B(1682, 10, 94))) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio2 = iA05 * 3;
                return minCompressionRatio2 / (maxPixels * 2);
            case 1187890754:
                boolean zEquals = str.equals(A0B(1692, 13, 22));
                if (A12[2].charAt(6) == 'n') {
                    throw new RuntimeException();
                }
                A12[6] = "BSk60PaXf0Sk22Sw2ltCbt0PrRKp4yQI";
                if (zEquals) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio3 = iA05 * 3;
                return minCompressionRatio3 / (maxPixels * 2);
            case 1331836730:
                if (str.equals(A0B(1655, 9, 91))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio4 = iA05 * 3;
                return minCompressionRatio4 / (maxPixels * 2);
            case 1599127256:
                if (str.equals(A0B(1705, 19, 98))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio5 = iA05 * 3;
                return minCompressionRatio5 / (maxPixels * 2);
            case 1599127257:
                if (str.equals(A0B(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED, 19, 109))) {
                    b = 5;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio6 = iA05 * 3;
                return minCompressionRatio6 / (maxPixels * 2);
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (A0B(179, 14, 116).equals(AbstractC46115C.A06)) {
                            return -1;
                        }
                        iA05 = AbstractC46115C.A05(i, 16) * AbstractC46115C.A05(i2, 16) * 16 * 16;
                        maxPixels = 2;
                        break;
                        break;
                    case 3:
                        iA05 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA05 = i * i2;
                        maxPixels = 4;
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio7 = iA05 * 3;
                return minCompressionRatio7 / (maxPixels * 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03(long j, long j2, long j3, long j4, boolean z) {
        double playbackSpeed = A1f();
        long j5 = (long) ((j4 - j) / playbackSpeed);
        if (z) {
            return j5 - (j3 - j2);
        }
        return j5;
    }

    @MetaExoPlayerCustomization("D64704257: Adding a new param to control AI FRC")
    private final MediaFormat A08(C7472qI c7472qI, C5246Fm c5246Fm, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A0B(1462, 4, 83), c7472qI.A0W);
        mediaFormat.setInteger(A0B(1755, 5, 79), c7472qI.A0L);
        mediaFormat.setInteger(A0B(1307, 6, 73), c7472qI.A0A);
        AbstractC45814i.A06(mediaFormat, c7472qI.A0X);
        AbstractC45814i.A03(mediaFormat, A0B(1286, 10, 109), c7472qI.A01);
        AbstractC45814i.A04(mediaFormat, A0B(1548, 16, 7), c7472qI.A0F);
        AbstractC45814i.A02(mediaFormat, c7472qI.A0N);
        mediaFormat.setInteger(A0B(1447, 9, 1), c5246Fm.A02);
        mediaFormat.setInteger(A0B(1423, 10, 25), c5246Fm.A00);
        AbstractC45814i.A04(mediaFormat, A0B(1433, 14, 113), c5246Fm.A01);
        if (AbstractC46115C.A02 >= 23) {
            String strA0B = A0B(1521, 8, 113);
            String[] strArr = A12;
            if (strArr[4].charAt(23) == strArr[7].charAt(23)) {
                throw new RuntimeException();
            }
            A12[2] = "2RIBJj1oBKSBZdAo5SnKQdQzGU6CRjTj";
            mediaFormat.setInteger(strA0B, 0);
        }
        if (z) {
            mediaFormat.setInteger(A0B(1173, 8, 16), 0);
        }
        AbstractC7032is.A03(this.A0z, mediaFormat);
        if (i != 0) {
            A0T(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    private final C5246Fm A0A(C4956B3 c4956b3, C7472qI c7472qI, C7472qI[] c7472qIArr) throws C4986BX {
        int maxWidth;
        int iMax = c7472qI.A0L;
        int iMax2 = c7472qI.A0A;
        int iA00 = A00(c7472qI);
        int maxHeight = c7472qIArr.length;
        if (maxHeight == 1) {
            return new C5246Fm(iMax, iMax2, iA00);
        }
        int i = 0;
        for (C7472qI streamFormat : c7472qIArr) {
            if (A0v(c4956b3.A04, c7472qI, streamFormat)) {
                int maxWidth2 = streamFormat.A0L;
                if (maxWidth2 != -1) {
                    int maxWidth3 = streamFormat.A0A;
                    if (maxWidth3 == -1) {
                        maxWidth = 1;
                    } else {
                        maxWidth = 0;
                    }
                } else {
                    maxWidth = 1;
                }
                i |= maxWidth;
                int i2 = streamFormat.A0L;
                int maxHeight2 = A12[6].charAt(29);
                if (maxHeight2 == 120) {
                    throw new RuntimeException();
                }
                A12[2] = "vHVCHU2tj4jzHHyhZwddXygsl3jVFph7";
                iMax = Math.max(iMax, i2);
                int maxWidth4 = streamFormat.A0A;
                iMax2 = Math.max(iMax2, maxWidth4);
                int maxWidth5 = A00(streamFormat);
                iA00 = Math.max(iA00, maxWidth5);
            }
        }
        if (i != 0) {
            StringBuilder sbAppend = new StringBuilder().append(A0B(921, 43, 89)).append(iMax);
            String strA0B = A0B(1775, 1, 84);
            String string = sbAppend.append(strA0B).append(iMax2).toString();
            String strA0B2 = A0B(682, 23, 0);
            AbstractC45794g.A07(strA0B2, string);
            Point pointA07 = A07(c4956b3, c7472qI);
            if (pointA07 != null) {
                int maxWidth6 = pointA07.x;
                iMax = Math.max(iMax, maxWidth6);
                int maxWidth7 = pointA07.y;
                iMax2 = Math.max(iMax2, maxWidth7);
                int maxWidth8 = A02(c7472qI.A0W, iMax, iMax2);
                iA00 = Math.max(iA00, maxWidth8);
                AbstractC45794g.A07(strA0B2, A0B(246, 34, 11) + iMax + strA0B + iMax2);
            }
        }
        return new C5246Fm(iMax, iMax2, iA00);
    }

    public static List<C4956B3> A0C(InterfaceC4982BT interfaceC4982BT, C7472qI c7472qI) throws C4986BX {
        ArrayList arrayList = new ArrayList();
        String alternativeMimeType = C4989Ba.A0P(c7472qI);
        if (alternativeMimeType != null) {
            List<C4956B3> listA7o = interfaceC4982BT.A7o(alternativeMimeType, false, false);
            if (AbstractC46115C.A02 >= 26) {
                if (A0B(1664, 18, 7).equals(c7472qI.A0W) && !listA7o.isEmpty()) {
                    return listA7o;
                }
                return arrayList;
            }
            return arrayList;
        }
        return arrayList;
    }

    public static List<C4956B3> A0D(InterfaceC4982BT interfaceC4982BT, C7472qI c7472qI, boolean z) throws C4986BX {
        String str = c7472qI.A0W;
        if (str == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(interfaceC4982BT.A7o(str, z, false));
    }

    private void A0E() {
        InterfaceC4953B0 interfaceC4953B0A1j;
        this.A0i = false;
        if (AbstractC46115C.A02 >= 23 && this.A0k && (interfaceC4953B0A1j = A1j()) != null) {
            this.A00 = new C7275n5(this, interfaceC4953B0A1j);
        }
    }

    private void A0F() {
        this.A0G = -1;
        this.A0E = -1;
        this.A03 = -1.0f;
        this.A0F = -1;
    }

    @MetaExoPlayerCustomization("need for SR to release EGL context")
    private void A0G() {
        if (this.A0r.A0G() && MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A1t)) {
            this.A0r.A0A();
            throw null;
        }
    }

    private void A0H() {
        if (this.A0m > 0 && this.A05 > 0 && this.A05 >= this.A0m) {
            this.A0u.A00(this.A05, SystemClock.elapsedRealtime() - this.A0I);
        }
        this.A05 = 0;
        this.A0I = SystemClock.elapsedRealtime();
    }

    private void A0I() {
        InterfaceC4953B0 interfaceC4953B0A1j = A1j();
        if (interfaceC4953B0A1j != null && !this.A0c && interfaceC4953B0A1j.A9K() > 30) {
            A0V(super.A0g);
            this.A0c = true;
        }
    }

    private void A0J() {
        if (this.A09 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0J;
            long elapsedMs = jElapsedRealtime - now;
            this.A0u.A01(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0J = jElapsedRealtime;
        }
    }

    private void A0K() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0G != this.A08 || this.A0E != this.A06 || this.A0F != this.A07 || this.A03 != this.A01) {
            this.A0u.A07(new C7425pW(this.A08, this.A06, this.A07, this.A01));
            this.A0G = this.A08;
            this.A0E = this.A06;
            this.A0F = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0L() {
        if (this.A0i) {
            this.A0u.A0D(this.A0U);
        }
    }

    private void A0M() {
        if (this.A0G != -1 || this.A0E != -1) {
            this.A0u.A07(new C7425pW(this.A0G, this.A0E, this.A0F, this.A03));
        }
    }

    private void A0N() {
        long jElapsedRealtime;
        if (this.A0p > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.A0p;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A0M = jElapsedRealtime;
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private void A0O() {
        super.A0h.A03(super.A0f);
    }

    private final void A0Q(int i) {
        super.A0h.A04 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0h.A07 = Math.max(this.A05, super.A0h.A07);
        if (this.A09 >= this.A0l) {
            A0J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    private final void A0R(long j, long j2, float f) {
        int positionMs;
        int presentationGapMs;
        int iA01 = (int) AbstractC44522Y.A01(j);
        int iA02 = (int) AbstractC44522Y.A01(j2);
        if (iA02 > 1000 && iA02 < 10000) {
            int i = iA01 + iA02;
            int positionMs2 = this.A0A;
            int presentationGapMs2 = this.A0B;
            if (i > positionMs2 + presentationGapMs2 + 1000) {
                int presentationGapMs3 = this.A0A;
                if (iA01 > presentationGapMs3) {
                    int positionMs3 = this.A0A;
                    int presentationGapMs4 = this.A0B;
                    if (iA01 < positionMs3 + presentationGapMs4) {
                        C46796I c46796i = super.A0h;
                        int i2 = c46796i.A0E;
                        int positionMs4 = this.A0A;
                        int presentationGapMs5 = this.A0B;
                        c46796i.A0E = i2 + ((int) (((double) (((iA01 + iA02) - (positionMs4 + presentationGapMs5)) * f)) / 1000.0d));
                    } else {
                        positionMs = this.A0A;
                        presentationGapMs = this.A0B;
                        if (iA01 > positionMs + presentationGapMs) {
                            int presentationGapMs6 = (int) (((double) (iA02 * f)) / 1000.0d);
                            super.A0h.A0E += presentationGapMs6;
                        }
                    }
                } else {
                    positionMs = this.A0A;
                    presentationGapMs = this.A0B;
                    if (iA01 > positionMs + presentationGapMs) {
                        int presentationGapMs7 = (int) (((double) (iA02 * f)) / 1000.0d);
                        super.A0h.A0E += presentationGapMs7;
                    }
                }
                this.A0A = iA01;
                this.A0B = iA02;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(long j, long j2, C7472qI c7472qI, MediaFormat mediaFormat) {
        if (this.A0X != null) {
            this.A0X.AGS(j, j2, c7472qI, mediaFormat);
        }
    }

    public static void A0T(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A0B(1609, 17, 49), true);
        mediaFormat.setInteger(A0B(1157, 16, 51), i);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    private void A0U(Surface surface) throws C4904AD {
        if (surface == null) {
            if (this.A0T != null) {
                surface = this.A0T;
            } else {
                C4956B3 c4956b3A1k = A1k();
                if (c4956b3A1k != null && A0r(c4956b3A1k)) {
                    this.A0T = DummySurface.A01(this.A0q, c4956b3A1k.A06);
                    surface = this.A0T;
                }
            }
        }
        boolean zA03 = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A0X);
        if (this.A0U != surface) {
            this.A0U = surface;
            this.A0Q = SystemClock.elapsedRealtime();
            if (A12[6].charAt(29) == 'x') {
                throw new RuntimeException();
            }
            A12[1] = "flDNbofxs3CTffCwMDp3s46Nt2jaxTe4";
            int iA9A = A9A();
            boolean shouldIgnoreUnknownSurfaceSize = false;
            boolean z = this.A0f && AAe();
            if (iA9A == 1 || iA9A == 2) {
                InterfaceC4953B0 interfaceC4953B0A1j = A1j();
                boolean shouldReInitCodecUponSurfaceSetFailure = this.A0r.A0G();
                if (!shouldReInitCodecUponSurfaceSetFailure) {
                    int state = AbstractC46115C.A02;
                    if (state < 23 || interfaceC4953B0A1j == null || surface == null) {
                        A1n();
                        A1p();
                    } else {
                        boolean shouldReInitCodecUponSurfaceSetFailure2 = this.A0b;
                        if (!shouldReInitCodecUponSurfaceSetFailure2) {
                            if (zA03) {
                                try {
                                    A0d(interfaceC4953B0A1j, surface);
                                } catch (IllegalStateException unused) {
                                    A1n();
                                    A1p();
                                }
                            } else {
                                A0d(interfaceC4953B0A1j, surface);
                            }
                        } else {
                            A1n();
                            A1p();
                        }
                    }
                }
            }
            if (surface != null && surface != this.A0T) {
                A0M();
                A0E();
                if (iA9A == 2 || z) {
                    A0N();
                }
                if (this.A0r.A0G()) {
                    if (MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A0j) && this.A0r.A06 != null) {
                        shouldIgnoreUnknownSurfaceSize = true;
                    }
                    if (!shouldIgnoreUnknownSurfaceSize) {
                        this.A0r.A0C(surface, C45984z.A03);
                        return;
                    }
                    return;
                }
                return;
            }
            A0F();
            A0E();
            if (!this.A0r.A0G()) {
                return;
            }
            this.A0r.A08();
            throw null;
        }
        if (surface != null && surface != this.A0T) {
            A0M();
            if (A12[3].length() != 21) {
                A12[6] = "VhVyjLmIQ4bbJ9563iENK2u1xmxcLHgS";
                A0L();
            } else {
                A0L();
            }
        }
    }

    private void A0V(C7472qI c7472qI) {
        InterfaceC4953B0 codec = A1j();
        if (codec != null && c7472qI != null) {
            Pair<Long, Integer> pairA8j = codec.A8j();
            if (((Long) pairA8j.first).longValue() > 0) {
                super.A0h.A04(pairA8j);
                C5285GP c5285gp = this.A0u;
                if (A12[2].charAt(6) == 'n') {
                    throw new RuntimeException();
                }
                A12[3] = "UGSzGWhN7NgjOmIm99IkQUILfPM9Cd";
                c5285gp.A04(super.A0h.A00, c7472qI);
            }
        }
    }

    private final void A0W(InterfaceC4953B0 interfaceC4953B0, int i, long j) {
        AbstractC460354.A02(A0B(1262, 15, 126));
        interfaceC4953B0.AHi(i, false);
        AbstractC460354.A00();
        A0Q(1);
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0X(InterfaceC4953B0 interfaceC4953B0, int i, long j) {
        if (this.A0w) {
            A0Y(interfaceC4953B0, i, j);
            return;
        }
        A0K();
        try {
            AbstractC460354.A02(A0B(1529, 19, 51));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC4953B0.AHi(i, true);
            long j2 = super.A0f;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0f = j2 + (startRenderTime - jElapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0h.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC460354.A00();
        }
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0Y(InterfaceC4953B0 interfaceC4953B0, int i, long j) {
        AbstractC460354.A02(A0B(1529, 19, 51));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC4953B0.AHi(i, true);
        long j2 = super.A0f;
        long startRenderTime = SystemClock.elapsedRealtime();
        super.A0f = j2 + (startRenderTime - jElapsedRealtime);
        AbstractC460354.A00();
        super.A0h.A09++;
        A0H();
        if (!this.A0r.A0G()) {
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            A0K();
            A27();
        }
    }

    private final void A0Z(InterfaceC4953B0 interfaceC4953B0, int i, long j) {
        AbstractC460354.A02(A0B(1579, 15, 29));
        interfaceC4953B0.AHi(i, false);
        AbstractC460354.A00();
        super.A0h.A0B++;
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0a(InterfaceC4953B0 interfaceC4953B0, int i, long j, long j2) {
        if (this.A0w) {
            A0c(interfaceC4953B0, i, j, j2, true);
            return;
        }
        A0K();
        A0S(j, j2, super.A0g, this.A0S);
        try {
            AbstractC460354.A02(A0B(1529, 19, 51));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC4953B0.AHh(i, j2);
            long j3 = super.A0f;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0f = j3 + (startRenderTime - jElapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0h.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC460354.A00();
        }
    }

    private final void A0b(@MetaExoPlayerCustomization InterfaceC4953B0 interfaceC4953B0, int i, long j, long j2, boolean z) {
        if (this.A0w) {
            A0c(interfaceC4953B0, i, j, j2, z);
            return;
        }
        A0K();
        A0S(j, j2, super.A0g, this.A0S);
        try {
            AbstractC460354.A02(A0B(1529, 19, 51));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC4953B0.AHh(i, j2);
            long j3 = super.A0f;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0f = j3 + (startRenderTime - jElapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0h.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC460354.A00();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006d  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x004b  */
    @MetaExoPlayerCustomization("notifyFrameMetadataListener be removed once we take the Exo renderOutputBufferNow Function refactor")
    private final void A0c(InterfaceC4953B0 interfaceC4953B0, int i, long j, long j2, boolean z) {
        if (z) {
            C7472qI c7472qI = super.A0g;
            MediaFormat mediaFormat = this.A0S;
            if (A12[3].length() != 21) {
                A12[6] = "fwcrFdVwexqT3olBri8BzspmWxCtZa94";
                A0S(j, j2, c7472qI, mediaFormat);
                AbstractC460354.A02(A0B(1529, 19, 51));
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                interfaceC4953B0.AHh(i, j2);
                long j3 = super.A0f;
                long startRenderTime = SystemClock.elapsedRealtime();
                super.A0f = j3 + (startRenderTime - jElapsedRealtime);
                if (A12[3].length() != 21) {
                    String[] strArr = A12;
                    strArr[5] = "NtBdNhJ";
                    strArr[0] = "S1Pe4Cz";
                    AbstractC460354.A00();
                    super.A0h.A09++;
                    A0H();
                    if (!this.A0r.A0G()) {
                        this.A0P = SystemClock.elapsedRealtime() * 1000;
                        A0K();
                        A27();
                        A0O();
                        return;
                    }
                    return;
                }
            }
        } else {
            AbstractC460354.A02(A0B(1529, 19, 51));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            interfaceC4953B0.AHh(i, j2);
            long j4 = super.A0f;
            long startRenderTime2 = SystemClock.elapsedRealtime();
            super.A0f = j4 + (startRenderTime2 - jElapsedRealtime2);
            if (A12[3].length() != 21) {
                String[] strArr2 = A12;
                strArr2[5] = "NtBdNhJ";
                strArr2[0] = "S1Pe4Cz";
                AbstractC460354.A00();
                super.A0h.A09++;
                A0H();
                if (!this.A0r.A0G()) {
                    this.A0P = SystemClock.elapsedRealtime() * 1000;
                    A0K();
                    A27();
                    A0O();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    public static void A0d(InterfaceC4953B0 interfaceC4953B0, Surface surface) {
        interfaceC4953B0.AJb(surface);
    }

    @MetaExoPlayerCustomization
    private void A0f(Object obj) {
        this.A0d = ((Boolean) obj).booleanValue();
        A1j();
    }

    private boolean A0g() {
        if (this.A0n <= 0) {
            return false;
        }
        boolean z = this.A0K == -9223372036854775807L || System.currentTimeMillis() - this.A0K <= ((long) this.A0n);
        if (this.A0K == -9223372036854775807L) {
            AbstractC45794g.A07(A0B(682, 23, 0), A0B(TypedValues.Custom.TYPE_FLOAT, 20, 62));
            this.A0K = System.currentTimeMillis();
        }
        return z;
    }

    public static boolean A0h() {
        return AbstractC46115C.A02 >= 21;
    }

    public static boolean A0i() {
        return AbstractC46115C.A02 <= 22 && A0B(1280, 6, 87).equals(AbstractC46115C.A03) && A0B(725, 6, 88).equals(AbstractC46115C.A05);
    }

    public static boolean A0k(long j) {
        return j < -30000;
    }

    public static boolean A0l(long j) {
        return j < -500000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public boolean A0m(long j, long j2) {
        boolean z;
        boolean z2 = A9A() == 2;
        boolean isStarted = this.A0j;
        if (!isStarted) {
            if (z2) {
                z = true;
            } else {
                boolean isStarted2 = this.A0g;
                if (isStarted2) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            boolean isStarted3 = this.A0i;
            z = !isStarted3;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.A0P;
        if (this.A0M == -9223372036854775807L && j >= A1i()) {
            if (z) {
                return true;
            }
            if (z2) {
                boolean isStarted4 = A0p(j2, jElapsedRealtime);
                if (isStarted4) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A0n(long j, long j2) {
        return A0l(j);
    }

    private final boolean A0o(long j, long j2) {
        return A0k(j);
    }

    private final boolean A0p(long j, long j2) {
        return A0k(j) && j2 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean A0q(InterfaceC4953B0 interfaceC4953B0, int i, long j, long j2) throws C4904AD {
        int iA1Q = A1Q(j2);
        if (iA1Q == 0) {
            return false;
        }
        C46796I c46796i = super.A0h;
        int droppedSourceBufferCount = c46796i.A06;
        c46796i.A06 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0Q(droppedSourceBufferCount2 + iA1Q);
        A1m();
        if (!this.A0r.A0G()) {
            return true;
        }
        this.A0r.A09();
        throw null;
    }

    private boolean A0r(C4956B3 c4956b3) {
        return AbstractC46115C.A02 >= 23 && this.A0e && !this.A0k && !A0u(c4956b3.A03) && (!c4956b3.A06 || DummySurface.A05(this.A0q));
    }

    /* JADX WARN: Code duplicated, block: B:404:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:493:0x0be0  */
    private final boolean A0u(String str) {
        byte b = 0;
        if (str.startsWith(A0B(743, 10, 61))) {
            return false;
        }
        synchronized (C435610.class) {
            if (!A10) {
                if (A0B(1253, 6, 98).equals(AbstractC46115C.A03)) {
                    A0z = true;
                } else {
                    int i = AbstractC46115C.A02;
                    byte b2 = Ascii.ESC;
                    if (i <= 27 && A0B(563, 5, 2).equals(AbstractC46115C.A03)) {
                        A0z = true;
                    } else if (AbstractC46115C.A02 < 27) {
                        String str2 = AbstractC46115C.A03;
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (!str2.equals(A0B(TypedValues.CycleType.TYPE_WAVE_PERIOD, 14, 80))) {
                                    b2 = -1;
                                } else {
                                    b2 = 43;
                                }
                                break;
                            case -2144781185:
                                if (!str2.equals(A0B(437, 14, 87))) {
                                    b2 = -1;
                                } else {
                                    b2 = 44;
                                }
                                break;
                            case -2144781160:
                                if (!str2.equals(A0B(451, 14, 23))) {
                                    b2 = -1;
                                } else {
                                    b2 = 45;
                                }
                                break;
                            case -2097309513:
                                if (!str2.equals(A0B(604, 6, 104))) {
                                    b2 = -1;
                                } else {
                                    b2 = 63;
                                }
                                break;
                            case -2022874474:
                                if (!str2.equals(A0B(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 10, 59))) {
                                    b2 = -1;
                                } else {
                                    b2 = 19;
                                }
                                break;
                            case -1978993182:
                                if (!str2.equals(A0B(731, 6, 0))) {
                                    b2 = -1;
                                } else {
                                    b2 = 77;
                                }
                                break;
                            case -1978990237:
                                if (!str2.equals(A0B(737, 6, 72))) {
                                    b2 = -1;
                                } else {
                                    b2 = 78;
                                }
                                break;
                            case -1936688988:
                                if (!str2.equals(A0B(777, 6, 31))) {
                                    b2 = -1;
                                } else {
                                    b2 = 88;
                                }
                                break;
                            case -1936688066:
                                if (!str2.equals(A0B(783, 6, 81))) {
                                    b2 = -1;
                                } else {
                                    b2 = 89;
                                }
                                break;
                            case -1936688065:
                                if (!str2.equals(A0B(789, 6, 44))) {
                                    b2 = -1;
                                } else {
                                    b2 = 90;
                                }
                                break;
                            case -1931988508:
                                if (!str2.equals(A0B(138, 10, 6))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22503VT;
                                }
                                break;
                            case -1696512866:
                                if (!str2.equals(A0B(1137, 6, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 123;
                                }
                                break;
                            case -1680025915:
                                if (!str2.equals(A0B(280, 7, 111))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.DC2;
                                }
                                break;
                            case -1615810839:
                                if (!str2.equals(A0B(803, 8, 98))) {
                                    b2 = -1;
                                } else {
                                    b2 = 91;
                                }
                                break;
                            case -1554255044:
                                if (!str2.equals(A0B(1626, 9, 41))) {
                                    b2 = -1;
                                } else {
                                    b2 = 116;
                                }
                                break;
                            case -1481772737:
                                if (!str2.equals(A0B(1494, 9, 63))) {
                                    b2 = -1;
                                } else {
                                    b2 = 84;
                                }
                                break;
                            case -1481772730:
                                if (!str2.equals(A0B(InterfaceC11669Sd.c.f25688f, 9, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 85;
                                }
                                break;
                            case -1481772729:
                                if (!str2.equals(A0B(1512, 9, 46))) {
                                    b2 = -1;
                                } else {
                                    b2 = 86;
                                }
                                break;
                            case -1320080169:
                                if (!str2.equals(A0B(521, 14, 74))) {
                                    b2 = -1;
                                } else {
                                    b2 = 41;
                                }
                                break;
                            case -1217592143:
                                if (!str2.equals(A0B(193, 11, 54))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22499SI;
                                }
                                break;
                            case -1180384755:
                                if (!str2.equals(A0B(1353, 6, 98))) {
                                    b2 = -1;
                                } else {
                                    b2 = 59;
                                }
                                break;
                            case -1139198265:
                                if (!str2.equals(A0B(1015, 9, 28))) {
                                    b2 = -1;
                                } else {
                                    b2 = 104;
                                }
                                break;
                            case -1052835013:
                                if (!str2.equals(A0B(1466, 6, 37))) {
                                    b2 = -1;
                                } else {
                                    b2 = 75;
                                }
                                break;
                            case -993250464:
                                if (!str2.equals(A0B(12, 7, 120))) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case -993250458:
                                if (!str2.equals(A0B(19, 7, 110))) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case -965403638:
                                if (!str2.equals(A0B(1564, 8, 27))) {
                                    b2 = -1;
                                } else {
                                    b2 = 106;
                                }
                                break;
                            case -958336948:
                                if (!str2.equals(A0B(324, 11, 1))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22494GS;
                                }
                                break;
                            case -879245230:
                                if (!str2.equals(A0B(1603, 6, 14))) {
                                    b2 = -1;
                                } else {
                                    b2 = 112;
                                }
                                break;
                            case -842500323:
                                if (!str2.equals(A0B(1472, 10, 29))) {
                                    b2 = -1;
                                } else {
                                    b2 = 76;
                                }
                                break;
                            case -821392978:
                                if (!str2.equals(A0B(39, 7, 16))) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case -797483286:
                                if (!str2.equals(A0B(1006, 9, 104))) {
                                    b2 = -1;
                                } else {
                                    b2 = 105;
                                }
                                break;
                            case -794946968:
                                if (!str2.equals(A0B(1743, 6, 54))) {
                                    b2 = -1;
                                } else {
                                    b2 = 117;
                                }
                                break;
                            case -788334647:
                                if (!str2.equals(A0B(1749, 6, 88))) {
                                    b2 = -1;
                                } else {
                                    b2 = 118;
                                }
                                break;
                            case -782144577:
                                if (!str2.equals(A0B(753, 9, 85))) {
                                    b2 = -1;
                                } else {
                                    b2 = 79;
                                }
                                break;
                            case -575125681:
                                if (!str2.equals(A0B(507, 14, 73))) {
                                    b2 = -1;
                                } else {
                                    b2 = 40;
                                }
                                break;
                            case -521118391:
                                if (!str2.equals(A0B(409, 14, 16))) {
                                    b2 = -1;
                                } else {
                                    b2 = 42;
                                }
                                break;
                            case -430914369:
                                if (!str2.equals(A0B(817, 10, 78))) {
                                    b2 = -1;
                                } else {
                                    b2 = 92;
                                }
                                break;
                            case -290434366:
                                if (!str2.equals(A0B(1594, 9, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 107;
                                }
                                break;
                            case -282781963:
                                if (!str2.equals(A0B(171, 8, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22500SO;
                                }
                                break;
                            case -277133239:
                                if (!str2.equals(A0B(1143, 7, 77))) {
                                    b2 = -1;
                                } else {
                                    b2 = 124;
                                }
                                break;
                            case -173639913:
                                if (!str2.equals(A0B(292, 12, 77))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.SUB;
                                }
                                break;
                            case -56598463:
                                if (!str2.equals(A0B(1767, 8, 41))) {
                                    b2 = -1;
                                } else {
                                    b2 = 120;
                                }
                                break;
                            case 2126:
                                if (!str2.equals(A0B(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 2, 93))) {
                                    b2 = -1;
                                } else {
                                    b2 = 17;
                                }
                                break;
                            case 2564:
                                if (!str2.equals(A0B(856, 2, 42))) {
                                    b2 = -1;
                                } else {
                                    b2 = 100;
                                }
                                break;
                            case 2715:
                                if (!str2.equals(A0B(1114, 2, 74))) {
                                    b2 = -1;
                                } else {
                                    b2 = 113;
                                }
                                break;
                            case 2719:
                                if (!str2.equals(A0B(1121, 2, 19))) {
                                    b2 = -1;
                                } else {
                                    b2 = 115;
                                }
                                break;
                            case 3483:
                                if (!str2.equals(A0B(1456, 2, 8))) {
                                    b2 = -1;
                                } else {
                                    b2 = 72;
                                }
                                break;
                            case 73405:
                                if (!str2.equals(A0B(594, 3, 12))) {
                                    b2 = -1;
                                } else {
                                    b2 = 62;
                                }
                                break;
                            case 75739:
                                if (!str2.equals(A0B(668, 3, 33))) {
                                    b2 = -1;
                                } else {
                                    b2 = 68;
                                }
                                break;
                            case 76779:
                                if (!str2.equals(A0B(679, 3, 19))) {
                                    b2 = -1;
                                } else {
                                    b2 = 74;
                                }
                                break;
                            case 78669:
                                if (!str2.equals(A0B(766, 3, 39))) {
                                    b2 = -1;
                                } else {
                                    b2 = 82;
                                }
                                break;
                            case 79305:
                                if (!str2.equals(A0B(795, 3, 93))) {
                                    b2 = -1;
                                } else {
                                    b2 = 94;
                                }
                                break;
                            case 80618:
                                if (!str2.equals(A0B(866, 3, 45))) {
                                    b2 = -1;
                                } else {
                                    b2 = 102;
                                }
                                break;
                            case 88274:
                                if (!str2.equals(A0B(1150, 3, 69))) {
                                    b2 = -1;
                                } else {
                                    b2 = 125;
                                }
                                break;
                            case 98846:
                                if (!str2.equals(A0B(1247, 3, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.SYN;
                                }
                                break;
                            case 98848:
                                if (!str2.equals(A0B(1250, 3, 4))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.ETB;
                                }
                                break;
                            case 99329:
                                if (!str2.equals(A0B(1259, 3, 97))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.CAN;
                                }
                                break;
                            case 101481:
                                if (!str2.equals(A0B(1277, 3, 5))) {
                                    b2 = -1;
                                } else {
                                    b2 = 38;
                                }
                                break;
                            case 1513190:
                                if (!str2.equals(A0B(0, 4, 40))) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 1514184:
                                if (!str2.equals(A0B(4, 4, 40))) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 1514185:
                                if (!str2.equals(A0B(8, 4, 36))) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2436959:
                                if (!str2.equals(A0B(762, 4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 81;
                                }
                                break;
                            case 2463773:
                                if (!str2.equals(A0B(838, 4, 35))) {
                                    b2 = -1;
                                } else {
                                    b2 = 96;
                                }
                                break;
                            case 2464648:
                                if (!str2.equals(A0B(847, 4, 65))) {
                                    b2 = -1;
                                } else {
                                    b2 = 98;
                                }
                                break;
                            case 2689555:
                                if (!str2.equals(A0B(1133, 4, 2))) {
                                    b2 = -1;
                                } else {
                                    b2 = 122;
                                }
                                break;
                            case 3154429:
                                if (!str2.equals(A0B(1296, 4, 94))) {
                                    b2 = -1;
                                } else {
                                    b2 = 39;
                                }
                                break;
                            case 3284551:
                                if (!str2.equals(A0B(1376, 4, 47))) {
                                    b2 = -1;
                                } else {
                                    b2 = SignedBytes.MAX_POWER_OF_TWO;
                                }
                                break;
                            case 3351335:
                                if (!str2.equals(A0B(1458, 4, 65))) {
                                    b2 = -1;
                                } else {
                                    b2 = 73;
                                }
                                break;
                            case 3386211:
                                if (!str2.equals(A0B(1482, 4, 48))) {
                                    b2 = -1;
                                } else {
                                    b2 = 80;
                                }
                                break;
                            case 41325051:
                                if (!str2.equals(A0B(671, 8, 34))) {
                                    b2 = -1;
                                } else {
                                    b2 = 71;
                                }
                                break;
                            case 55178625:
                                if (!str2.equals(A0B(160, 11, 108))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22490CR;
                                }
                                break;
                            case 61542055:
                                if (!str2.equals(A0B(26, 5, 78))) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case 65355429:
                                if (!str2.equals(A0B(MBSupportMuteAdType.INTERSTITIAL_VIDEO, 5, 54))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22491EM;
                                }
                                break;
                            case 66214468:
                                if (!str2.equals(A0B(345, 5, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22502US;
                                }
                                break;
                            case 66214470:
                                if (!str2.equals(A0B(350, 5, 103))) {
                                    b2 = -1;
                                } else {
                                    b2 = 32;
                                }
                                break;
                            case 66214473:
                                if (!str2.equals(A0B(355, 5, 34))) {
                                    b2 = -1;
                                } else {
                                    b2 = 33;
                                }
                                break;
                            case 66215429:
                                if (!str2.equals(A0B(360, 5, 13))) {
                                    b2 = -1;
                                } else {
                                    b2 = 34;
                                }
                                break;
                            case 66215431:
                                if (!str2.equals(A0B(365, 5, 1))) {
                                    b2 = -1;
                                } else {
                                    b2 = 35;
                                }
                                break;
                            case 66215433:
                                if (!str2.equals(A0B(370, 5, 73))) {
                                    b2 = -1;
                                } else {
                                    b2 = 36;
                                }
                                break;
                            case 66216390:
                                if (!str2.equals(A0B(375, 5, 7))) {
                                    b2 = -1;
                                } else {
                                    b2 = 37;
                                }
                                break;
                            case 76402249:
                                if (!str2.equals(A0B(798, 5, 34))) {
                                    b2 = -1;
                                } else {
                                    b2 = 95;
                                }
                                break;
                            case 76404105:
                                if (!str2.equals(A0B(842, 5, 99))) {
                                    b2 = -1;
                                } else {
                                    b2 = 97;
                                }
                                break;
                            case 76404911:
                                if (!str2.equals(A0B(851, 5, 19))) {
                                    b2 = -1;
                                } else {
                                    b2 = 99;
                                }
                                break;
                            case 80963634:
                                if (!str2.equals(A0B(1116, 5, 14))) {
                                    b2 = -1;
                                } else {
                                    b2 = 114;
                                }
                                break;
                            case 82882791:
                                if (!str2.equals(A0B(1128, 5, 88))) {
                                    b2 = -1;
                                } else {
                                    b2 = 121;
                                }
                                break;
                            case 98715550:
                                if (!str2.equals(A0B(1334, 5, 50))) {
                                    b2 = -1;
                                } else {
                                    b2 = 56;
                                }
                                break;
                            case 101370885:
                                if (!str2.equals(A0B(1380, 5, 40))) {
                                    b2 = -1;
                                } else {
                                    b2 = 65;
                                }
                                break;
                            case 102844228:
                                if (!str2.equals(A0B(1385, 5, 5))) {
                                    b2 = -1;
                                } else {
                                    b2 = 66;
                                }
                                break;
                            case 165221241:
                                if (!str2.equals(A0B(31, 8, 7))) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 182191441:
                                if (!str2.equals(A0B(237, 9, 32))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.NAK;
                                }
                                break;
                            case 245388979:
                                if (!str2.equals(A0B(1415, 8, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 70;
                                }
                                break;
                            case 287431619:
                                if (!str2.equals(A0B(1300, 7, 91))) {
                                    b2 = -1;
                                } else {
                                    b2 = 49;
                                }
                                break;
                            case 307593612:
                                if (!str2.equals(A0B(55, 8, 62))) {
                                    b2 = -1;
                                } else {
                                    b2 = 9;
                                }
                                break;
                            case 308517133:
                                if (!str2.equals(A0B(63, 8, 33))) {
                                    b2 = -1;
                                } else {
                                    b2 = 10;
                                }
                                break;
                            case 316215098:
                                if (!str2.equals(A0B(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, 8, 35))) {
                                    b2 = -1;
                                } else {
                                    b2 = 108;
                                }
                                break;
                            case 316215116:
                                if (!str2.equals(A0B(IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, 8, 35))) {
                                    b2 = -1;
                                } else {
                                    b2 = 109;
                                }
                                break;
                            case 316246811:
                                if (!str2.equals(A0B(1053, 8, 93))) {
                                    b2 = -1;
                                } else {
                                    b2 = 110;
                                }
                                break;
                            case 316246818:
                                if (!str2.equals(A0B(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, 8, 49))) {
                                    b2 = -1;
                                } else {
                                    b2 = 111;
                                }
                                break;
                            case 407160593:
                                if (!str2.equals(A0B(827, 11, 88))) {
                                    b2 = -1;
                                } else {
                                    b2 = 93;
                                }
                                break;
                            case 507412548:
                                if (!str2.equals(A0B(858, 8, 36))) {
                                    b2 = -1;
                                } else {
                                    b2 = 101;
                                }
                                break;
                            case 793982701:
                                if (!str2.equals(A0B(465, 14, 65))) {
                                    b2 = -1;
                                } else {
                                    b2 = 46;
                                }
                                break;
                            case 794038622:
                                if (!str2.equals(A0B(479, 14, 24))) {
                                    b2 = -1;
                                } else {
                                    b2 = 47;
                                }
                                break;
                            case 794040393:
                                if (!str2.equals(A0B(FacebookRequestErrorClassification.ESC_APP_INACTIVE, 14, 60))) {
                                    b2 = -1;
                                } else {
                                    b2 = 48;
                                }
                                break;
                            case 835649806:
                                if (!str2.equals(A0B(1408, 7, 9))) {
                                    b2 = -1;
                                } else {
                                    b2 = 69;
                                }
                                break;
                            case 917340916:
                                if (!str2.equals(A0B(46, 9, 71))) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            case 958008161:
                                if (!str2.equals(A0B(1367, 9, 39))) {
                                    b2 = -1;
                                } else {
                                    b2 = Base64.padSymbol;
                                }
                                break;
                            case 1060579533:
                                if (!str2.equals(A0B(1486, 8, 24))) {
                                    b2 = -1;
                                } else {
                                    b2 = 83;
                                }
                                break;
                            case 1150207623:
                                if (!str2.equals(A0B(LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 7, 16))) {
                                    b2 = -1;
                                } else {
                                    b2 = 67;
                                }
                                break;
                            case 1176899427:
                                if (!str2.equals(A0B(1359, 8, 92))) {
                                    b2 = -1;
                                } else {
                                    b2 = 60;
                                }
                                break;
                            case 1280332038:
                                if (!str2.equals(A0B(1327, 7, 64))) {
                                    b2 = -1;
                                } else {
                                    b2 = 51;
                                }
                                break;
                            case 1306947716:
                                if (!str2.equals(A0B(335, 10, 87))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22498RS;
                                }
                                break;
                            case 1349174697:
                                if (!str2.equals(A0B(1313, 14, 80))) {
                                    b2 = -1;
                                } else {
                                    b2 = 50;
                                }
                                break;
                            case 1522194893:
                                if (!str2.equals(A0B(1760, 7, 42))) {
                                    b2 = -1;
                                } else {
                                    b2 = 119;
                                }
                                break;
                            case 1691543273:
                                if (!str2.equals(A0B(230, 7, 44))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.DC4;
                                }
                                break;
                            case 1709443163:
                                if (!str2.equals(A0B(1339, 14, 3))) {
                                    b2 = -1;
                                } else {
                                    b2 = 57;
                                }
                                break;
                            case 1865889110:
                                if (!str2.equals(A0B(1572, 7, 76))) {
                                    b2 = -1;
                                } else {
                                    b2 = 103;
                                }
                                break;
                            case 1906253259:
                                if (!str2.equals(A0B(769, 8, 4))) {
                                    b2 = -1;
                                } else {
                                    b2 = 87;
                                }
                                break;
                            case 1977196784:
                                if (!str2.equals(A0B(582, 12, 87))) {
                                    b2 = -1;
                                } else {
                                    b2 = 58;
                                }
                                break;
                            case 2006372676:
                                if (!str2.equals(A0B(204, 14, 75))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.DLE;
                                }
                                break;
                            case 2029784656:
                                if (!str2.equals(A0B(549, 7, 35))) {
                                    b2 = -1;
                                } else {
                                    b2 = 52;
                                }
                                break;
                            case 2030379515:
                                if (!str2.equals(A0B(556, 7, 52))) {
                                    b2 = -1;
                                } else {
                                    b2 = 53;
                                }
                                break;
                            case 2033393791:
                                if (!str2.equals(A0B(111, 12, 6))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22492FF;
                                }
                                break;
                            case 2047190025:
                                if (!str2.equals(A0B(304, 10, Sdk.SDKError.Reason.TPAT_ERROR_VALUE))) {
                                    b2 = -1;
                                }
                                break;
                            case 2047252157:
                                if (!str2.equals(A0B(314, 10, 126))) {
                                    b2 = -1;
                                } else {
                                    b2 = Ascii.f22493FS;
                                }
                                break;
                            case 2048319463:
                                if (!str2.equals(A0B(568, 7, 80))) {
                                    b2 = -1;
                                } else {
                                    b2 = 54;
                                }
                                break;
                            case 2048855701:
                                if (!str2.equals(A0B(575, 7, 68))) {
                                    b2 = -1;
                                } else {
                                    b2 = 55;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                            case 76:
                            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                            case 91:
                            case 92:
                            case 93:
                            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                            case JSON_ENCODE_ERROR_VALUE:
                            case 120:
                            case TPAT_ERROR_VALUE:
                            case INVALID_ADS_ENDPOINT_VALUE:
                            case INVALID_RI_ENDPOINT_VALUE:
                            case 124:
                            case INVALID_METRICS_ENDPOINT_VALUE:
                                A0z = true;
                                break;
                        }
                        String str3 = AbstractC46115C.A06;
                        switch (str3.hashCode()) {
                            case -2038157993:
                                if (!str3.equals(A0B(877, 12, 88))) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case -2038157992:
                                if (!str3.equals(A0B(889, 12, 24))) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case -1984447159:
                                if (!str3.equals(A0B(719, 6, 41))) {
                                    b = -1;
                                } else {
                                    b = Ascii.f22499SI;
                                }
                                break;
                            case -1458559768:
                                if (!str3.equals(A0B(705, 14, 82))) {
                                    b = -1;
                                } else {
                                    b = Ascii.DLE;
                                }
                                break;
                            case -1337484257:
                                if (!str3.equals(A0B(148, 12, 113))) {
                                    b = -1;
                                } else {
                                    b = Ascii.DC4;
                                }
                                break;
                            case -1152053872:
                                if (!str3.equals(A0B(DescriptorProtos.Edition.EDITION_PROTO2_VALUE, 8, 36))) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case -1147076792:
                                if (!str3.equals(A0B(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 15, 104))) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case -708142633:
                                if (!str3.equals(A0B(869, 8, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                                    b = -1;
                                } else {
                                    b = Ascii.DC2;
                                }
                                break;
                            case -594534941:
                                if (!str3.equals(A0B(597, 7, 94))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case -581948979:
                                if (!str3.equals(A0B(1401, 7, 84))) {
                                    b = -1;
                                } else {
                                    b = Ascii.f22503VT;
                                }
                                break;
                            case -401692983:
                                if (!str3.equals(A0B(964, 8, 47))) {
                                    b = -1;
                                } else {
                                    b = Ascii.ETB;
                                }
                                break;
                            case -399133966:
                                if (!str3.equals(A0B(981, 8, 83))) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case -154985182:
                                if (!str3.equals(A0B(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 15, 63))) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case 2006354:
                                if (!str3.equals(A0B(71, 4, 107))) {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str3.equals(A0B(75, 4, 21))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 81951059:
                                if (!str3.equals(A0B(1123, 5, 24))) {
                                    b = -1;
                                } else {
                                    b = Ascii.CAN;
                                }
                                break;
                            case 439365079:
                                if (!str3.equals(A0B(535, 14, 20))) {
                                    b = -1;
                                } else {
                                    b = Ascii.SYN;
                                }
                                break;
                            case 511748841:
                                if (!str3.equals(A0B(972, 9, 76))) {
                                    b = -1;
                                } else {
                                    b = Ascii.f22492FF;
                                }
                                break;
                            case 619782645:
                                if (!str3.equals(A0B(89, 11, 27))) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 619782647:
                                if (!str3.equals(A0B(100, 11, 23))) {
                                    b = -1;
                                } else {
                                    b = Ascii.NAK;
                                }
                                break;
                            case 632760191:
                                if (!str3.equals(A0B(989, 9, 48))) {
                                    b = -1;
                                } else {
                                    b = Ascii.f22491EM;
                                }
                                break;
                            case 807317112:
                                if (!str3.equals(A0B(610, 7, 20))) {
                                    b = -1;
                                } else {
                                    b = Ascii.f22500SO;
                                }
                                break;
                            case 807374834:
                                if (!str3.equals(A0B(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 7, 39))) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1070811680:
                                if (!str3.equals(A0B(646, 13, 42))) {
                                    b = -1;
                                } else {
                                    b = Ascii.f22490CR;
                                }
                                break;
                            case 1682560972:
                                if (!str3.equals(A0B(79, 10, 61))) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 1921424370:
                                if (!str3.equals(A0B(1024, 13, 124))) {
                                    b = -1;
                                } else {
                                    b = Ascii.SUB;
                                }
                                break;
                            case 2133907258:
                                if (!str3.equals(A0B(659, 9, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 2:
                                A0z = true;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                A0z = true;
                                break;
                        }
                    }
                }
                A10 = true;
            }
        }
        return A0z;
    }

    public static boolean A0v(boolean z, C7472qI c7472qI, C7472qI c7472qI2) {
        return c7472qI.A0W.equals(c7472qI2.A0W) && c7472qI.A0F == c7472qI2.A0F && (z || (c7472qI.A0L == c7472qI2.A0L && c7472qI.A0A == c7472qI2.A0A)) && AbstractC46115C.A1E(c7472qI.A0N, c7472qI2.A0N);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1X() {
        super.A1X();
        this.A09 = 0;
        this.A0A = 0;
        this.A0B = 0;
        this.A0J = SystemClock.elapsedRealtime();
        this.A0P = SystemClock.elapsedRealtime() * 1000;
        if (this.A0w) {
            this.A0s.A0D();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1Y() {
        this.A0M = -9223372036854775807L;
        A0J();
        A0H();
        if (this.A0w) {
            this.A0s.A0E();
        }
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1Z() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0R = -9223372036854775807L;
        this.A0O = -9223372036854775807L;
        this.A0C = 0;
        A0F();
        A0E();
        this.A0t.A08();
        this.A00 = null;
        this.A0k = false;
        this.A0A = 0;
        this.A0B = 0;
        A0G();
        try {
            super.A1Z();
        } finally {
            super.A0h.A02();
            this.A0u.A09(super.A0h);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1a(long j, boolean z) throws C4904AD {
        super.A1a(j, z);
        if (this.A0r.A0G()) {
            this.A0r.A09();
            throw null;
        }
        A0E();
        if (this.A0w) {
            this.A0s.A0C();
        }
        this.A0N = -9223372036854775807L;
        this.A0L = -9223372036854775807L;
        this.A0O = -9223372036854775807L;
        this.A0A = 0;
        this.A0B = 0;
        if (this.A0C != 0) {
            this.A0R = this.A0x[this.A0C - 1];
            this.A0C = 0;
        }
        if (z) {
            A0N();
        } else {
            this.A0M = -9223372036854775807L;
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1b(boolean z, boolean z2) throws C4904AD {
        super.A1b(z, z2);
        this.A0k = A1V().A00;
        this.A0u.A0A(super.A0h);
        this.A0t.A09();
        this.A0g = z2;
        this.A0j = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.AbstractC4905AE
    public final void A1c(C7472qI[] c7472qIArr, long j, long j2) throws C4904AD {
        if (this.A0R == -9223372036854775807L) {
            this.A0R = j2;
        } else {
            if (this.A0C == this.A0x.length) {
                AbstractC45794g.A07(A0B(682, 23, 0), A0B(1069, 45, 88) + this.A0x[this.A0C - 1]);
            } else {
                this.A0C++;
            }
            long[] jArr = this.A0x;
            int i = this.A0C - 1;
            if (A12[1].charAt(20) != 's') {
                throw new RuntimeException();
            }
            A12[2] = "SAUgnWkYDj4XEzprgfj9YLgtcmW5pkCR";
            jArr[i] = j2;
            this.A0y[this.A0C - 1] = this.A0O;
        }
        super.A1c(c7472qIArr, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final int A1g(InterfaceC4953B0 interfaceC4953B0, C4956B3 c4956b3, C7472qI c7472qI, C7472qI c7472qI2) {
        if (AbstractC7032is.A04(this.A0z, c7472qI.A0L, c7472qI.A0A, c7472qI2.A0L, c7472qI2.A0A)) {
            return 0;
        }
        if (A21() && c7472qI.A0W.equals(c7472qI2.A0W) && c7472qI.A0F == c7472qI2.A0F) {
            return 1;
        }
        if (!A0v(c4956b3.A04, c7472qI, c7472qI2) || c7472qI2.A0L > this.A0W.A02 || c7472qI2.A0A > this.A0W.A00 || A00(c7472qI2) > this.A0W.A01) {
            return 0;
        }
        boolean zA0A = c7472qI.A0A(c7472qI2);
        if (A12[2].charAt(6) == 'n') {
            throw new RuntimeException();
        }
        A12[2] = "4hDLfGBXu2jWhDFi4VyshDOfpKmyRTIF";
        return zA0A ? 1 : 3;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final int A1h(InterfaceC4982BT interfaceC4982BT, InterfaceC4897A6 interfaceC4897A6, C7472qI c7472qI) throws C4986BX {
        if (A24(c7472qI)) {
            return 20;
        }
        return A01(interfaceC4982BT, c7472qI, super.A0j);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final List<C4956B3> A1l(InterfaceC4982BT interfaceC4982BT, C7472qI c7472qI, boolean z) throws C4986BX {
        return A0D(interfaceC4982BT, c7472qI, z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1m() throws C4904AD {
        super.A1m();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1n() {
        try {
            super.A1n();
            this.A04 = 0;
            if (this.A0T != null) {
                if (this.A0U == this.A0T) {
                    this.A0U = null;
                }
                this.A0T.release();
                if (A12[3].length() == 21) {
                    throw new RuntimeException();
                }
                String[] strArr = A12;
                strArr[4] = "7lrYh0KktVrYvVNtOiQ9Yi2M4ixXH9PV";
                strArr[7] = "rg1WGkW3vr4OYC0nZllkbznbWLz7shBk";
                this.A0T = null;
            }
        } catch (Throwable th) {
            this.A04 = 0;
            if (this.A0T != null) {
                if (this.A0U == this.A0T) {
                    this.A0U = null;
                }
                this.A0T.release();
                this.A0T = null;
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1q(long j) {
        super.A1q(j);
        this.A04--;
        while (this.A0C != 0 && j >= this.A0y[0]) {
            this.A0R = this.A0x[0];
            this.A0C--;
            System.arraycopy(this.A0x, 1, this.A0x, 0, this.A0C);
            System.arraycopy(this.A0y, 1, this.A0y, 0, this.A0C);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    @MetaExoPlayerCustomization("for SR video effects support of MCM")
    public final void A1r(C7472qI c7472qI) {
        boolean isSwitchingToDav1d;
        if (A24(c7472qI)) {
            if (super.A0g != null) {
                if (A0B(1645, 10, 45).equals(super.A0g.A0W)) {
                    isSwitchingToDav1d = false;
                } else {
                    isSwitchingToDav1d = true;
                }
            } else {
                isSwitchingToDav1d = false;
            }
            if (isSwitchingToDav1d) {
                boolean isSwitchingToDav1d2 = this.A0r.A0G();
                if (isSwitchingToDav1d2) {
                    this.A0r.A0A();
                    throw null;
                }
            }
            this.A0r.A09 = false;
            if (A12[2].charAt(6) == 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A12;
            strArr[5] = "sIGbpbi";
            strArr[0] = "eroBYPH";
            return;
        }
        int iA00 = MetaExoPlayerUpgradeConfig.A00(EnumC7072jY.A09);
        if (iA00 <= 0 || c7472qI == null) {
            return;
        }
        int videoWidthToEnableSR = c7472qI.A0L;
        if (videoWidthToEnableSR <= iA00) {
            return;
        }
        this.A0r.A09 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1s(C7472qI c7472qI) throws C4904AD {
        super.A1s(c7472qI);
        this.A0u.A05(c7472qI, null);
        this.A02 = c7472qI.A02;
        this.A0D = c7472qI.A0F;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1t(C7472qI c7472qI) throws C4904AD {
        if (!this.A0r.A0G()) {
            this.A0r.A0J(c7472qI, A1i());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1u(C7393p0 c7393p0) {
        this.A04++;
        this.A0O = Math.max(c7393p0.A01, this.A0O);
        if (AbstractC46115C.A02 < 23 && this.A0k) {
            A27();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1v(InterfaceC4953B0 interfaceC4953B0, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.A0S = mediaFormat;
        String strA0B = A0B(1229, 10, 102);
        boolean zContainsKey = mediaFormat.containsKey(strA0B);
        String strA0B2 = A0B(1239, 8, 55);
        String strA0B3 = A0B(1209, 11, 126);
        String strA0B4 = A0B(1220, 9, 2);
        boolean z = zContainsKey && mediaFormat.containsKey(strA0B4) && mediaFormat.containsKey(strA0B3) && mediaFormat.containsKey(strA0B2);
        if (z) {
            int integer3 = mediaFormat.getInteger(strA0B);
            int unappliedRotationDegrees = mediaFormat.getInteger(strA0B4);
            integer = (integer3 - unappliedRotationDegrees) + 1;
        } else {
            integer = mediaFormat.getInteger(A0B(1755, 5, 79));
        }
        this.A08 = integer;
        if (z) {
            int integer4 = mediaFormat.getInteger(strA0B3);
            int unappliedRotationDegrees2 = mediaFormat.getInteger(strA0B2);
            integer2 = (integer4 - unappliedRotationDegrees2) + 1;
        } else {
            integer2 = mediaFormat.getInteger(A0B(1307, 6, 73));
        }
        this.A06 = integer2;
        this.A01 = this.A02;
        if (AbstractC46115C.A02 >= 21) {
            if (this.A0D == 90 || this.A0D == 270) {
                int rotatedHeight = this.A08;
                int unappliedRotationDegrees3 = this.A06;
                this.A08 = unappliedRotationDegrees3;
                this.A06 = rotatedHeight;
                this.A01 = 1.0f / this.A01;
            }
        } else if (!this.A0r.A0G()) {
            int unappliedRotationDegrees4 = this.A0D;
            this.A07 = unappliedRotationDegrees4;
        }
        int unappliedRotationDegrees5 = this.A0H;
        interfaceC4953B0.AJs(unappliedRotationDegrees5);
        this.A0V = new C7425pW(this.A08, this.A06, this.A07, this.A01);
        this.A0s.A0F(super.A0g.A01);
        if (this.A0r.A0G()) {
            C5248Fo c5248Fo = this.A0r;
            C44672p c44672pA07 = super.A0g.A07();
            int unappliedRotationDegrees6 = this.A08;
            C44672p c44672pA0r = c44672pA07.A0r(unappliedRotationDegrees6);
            int unappliedRotationDegrees7 = this.A06;
            C44672p c44672pA0f = c44672pA0r.A0f(unappliedRotationDegrees7);
            int unappliedRotationDegrees8 = this.A07;
            c5248Fo.A0D(c44672pA0f.A0l(unappliedRotationDegrees8).A0Y(this.A01).A14());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("D40834768: [FBLite][Video] Enable low latency decoding for older Android versions"), @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Google Platform Dav1d Testing with Low Latency Decoding D62649046")})
    public final void A1w(C4956B3 c4956b3, InterfaceC4953B0 interfaceC4953B0, C7472qI c7472qI, MediaCrypto mediaCrypto) throws C4986BX {
        Surface surface;
        this.A0W = A0A(c4956b3, c7472qI, A1e());
        MediaFormat mediaFormatA08 = A08(c7472qI, this.A0W, this.A0v, this.A0o);
        if (this.A0U == null) {
            AbstractC45353y.A08(A0r(c4956b3));
            if (this.A0T == null) {
                Context context = this.A0q;
                boolean z = c4956b3.A06;
                if (A12[3].length() != 21) {
                    A12[6] = "yiNR3QranPnEQfiPRrhMyH37rGbgy01y";
                    this.A0T = DummySurface.A01(context, z);
                    surface = this.A0T;
                    if (A12[2].charAt(6) != 'n') {
                        String[] strArr = A12;
                        strArr[5] = "LRboFGG";
                        strArr[0] = "hwnKdFV";
                        this.A0U = surface;
                    }
                }
            } else {
                surface = this.A0T;
                if (A12[2].charAt(6) != 'n') {
                    String[] strArr2 = A12;
                    strArr2[5] = "LRboFGG";
                    strArr2[0] = "hwnKdFV";
                    this.A0U = surface;
                }
            }
            throw new RuntimeException();
        }
        boolean z2 = this.A0z.A0I;
        boolean z3 = false;
        String strA0B = A0B(1390, 11, 76);
        boolean z4 = z2 && c4956b3.A00 != null && c4956b3.A00.isFeatureSupported(strA0B);
        if (c4956b3.A03.equals(A0B(1181, 28, 58)) && this.A0z.A0B) {
            z3 = true;
        }
        if ((AbstractC46115C.A02 >= 30 || this.A0z.A0J) && z4 && !z3) {
            mediaFormatA08.setFeatureEnabled(strA0B, true);
            String[] strArr3 = A12;
            if (strArr3[5].length() != strArr3[0].length()) {
                String[] strArr4 = A12;
                strArr4[5] = "hfJ3VMX";
                strArr4[0] = "92OmzWl";
                mediaFormatA08.setInteger(strA0B, 1);
            } else {
                A12[3] = "U57WE1Icqa5Z";
                mediaFormatA08.setInteger(strA0B, 1);
            }
        }
        if (this.A0r.A0G()) {
            mediaFormatA08 = this.A0r.A06(mediaFormatA08);
        }
        if (this.A0r.A0G()) {
            C5248Fo c5248Fo = this.A0r;
            String[] strArr5 = A12;
            if (strArr5[4].charAt(23) == strArr5[7].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr6 = A12;
            strArr6[4] = "vjf6uovaHCWDHHkpYfphkXQkMzg9bbjD";
            strArr6[7] = "sOVWNDiAOc7Hvgm0kOVhLN9DKu4y3eSs";
            c5248Fo.A07();
            throw null;
        }
        interfaceC4953B0.A58(mediaFormatA08, this.A0U, mediaCrypto, 0, this.A0Y);
        int i = AbstractC46115C.A02;
        if (A12[6].charAt(29) != 'x') {
            A12[1] = "mXryJuZr86dScF3AeNkyss5tnbfSKjka";
            if (i < 23) {
                return;
            }
        } else {
            A12[6] = "iNbmoOXFYL62OfUeH4JwG1appoAFSKUM";
            if (i < 21) {
                return;
            }
        }
        if (this.A0k) {
            this.A00 = new C7275n5(this, interfaceC4953B0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0u.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final void A1y(String str, long j, long j2) {
        this.A0u.A0G(str, j, j2);
        this.A0b = A0u(str);
        if (this.A0w) {
            C5248Fo c5248Fo = this.A0r;
            if (A12[1].charAt(20) != 's') {
                throw new RuntimeException();
            }
            String[] strArr = A12;
            strArr[4] = "TMyTJm2xfuZjG3FrE9xxFPlKyVDcqwcD";
            strArr[7] = "gYDTbLVVgSlIu0qIAiA5ri17AONkCNH7";
            c5248Fo.A0E(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final void A1z(String str, C7472qI c7472qI) throws C4904AD {
        this.A0u.A0F(str);
        if (!this.A0r.A0G()) {
            this.A0r.A0J(c7472qI, A1i());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final boolean A20() {
        return this.A0a && SystemClock.elapsedRealtime() - this.A0Q < 500;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final boolean A22() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:151:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0261, code lost:
    
        if (r6 < com.unity3d.services.core.p295di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0266, code lost:
    
        if (r6 < com.unity3d.services.core.p295di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0269, code lost:
    
        A0a(r42, r44, r0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0272, code lost:
    
        r37.A0K = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0280, code lost:
    
        if (A0g() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0282, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0283, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
    
        if (A0q(r42, r44, r0, r38) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
    
        if (A0q(r42, r44, r0, r38) != false) goto L86;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A23(long r38, long r40, com.facebook.ads.redexgen.core.InterfaceC4953B0 r42, java.nio.ByteBuffer r43, int r44, int r45, long r46, boolean r48, boolean r49) throws com.facebook.ads.redexgen.core.C4904AD {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C435610.A23(long, long, com.facebook.ads.redexgen.X.B0, java.nio.ByteBuffer, int, int, long, boolean, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g
    public final boolean A25(C4956B3 c4956b3) {
        return (this.A0U != null && (this.A0Z || this.A0U.isValid())) || A0r(c4956b3);
    }

    public final Pair<ColorInfo, ColorInfo> A26(ColorInfo colorInfo) {
        if (!ColorInfo.A09(colorInfo)) {
            return Pair.create(ColorInfo.A09, ColorInfo.A09);
        }
        if (colorInfo.A03 == 7) {
            return Pair.create(colorInfo, colorInfo.A0A().A02(6).A03());
        }
        return Pair.create(colorInfo, colorInfo);
    }

    public final void A27() {
        this.A0j = true;
        if (!this.A0i) {
            this.A0i = true;
            this.A0u.A0D(this.A0U);
        }
    }

    @MetaExoPlayerCustomization("Required for VideoProcessorManager migration")
    public final boolean A28(long j, long j2, boolean z) {
        return A0k(j) && !z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC4905AE, com.facebook.ads.redexgen.core.InterfaceC47617c
    public final void A9i(int i, Object obj) throws C4904AD {
        if (i == 1) {
            A0U((Surface) obj);
            return;
        }
        if (i == 4) {
            this.A0H = ((Integer) obj).intValue();
            InterfaceC4953B0 interfaceC4953B0A1j = A1j();
            if (interfaceC4953B0A1j == null) {
                return;
            }
            interfaceC4953B0A1j.AJs(this.A0H);
            return;
        }
        if (i == 7) {
            this.A0X = (InterfaceC5262G2) obj;
            return;
        }
        if (i == 10001) {
            A0f(obj);
            return;
        }
        if (i == 13) {
            this.A0r.A0F((List) AbstractC45353y.A01(obj));
            return;
        }
        if (A12[3].length() != 21) {
            A12[1] = "MccsEzjpf2F4QgbfkxLUs5z2ugRdHbCL";
            if (i == 14) {
                C45984z c45984z = (C45984z) AbstractC45353y.A01(obj);
                if (c45984z.A03() == 0 || c45984z.A02() == 0) {
                    return;
                }
                Surface surface = this.A0U;
                String[] strArr = A12;
                if (strArr[5].length() == strArr[0].length()) {
                    A12[1] = "OmulH2jEP4hpWDROHXWwsVVsUaMV65qL";
                    if (surface == null) {
                        return;
                    }
                    this.A0r.A0C(this.A0U, c45984z);
                    return;
                }
            } else {
                super.A9i(i, obj);
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final boolean AAP() {
        boolean zAAP = super.AAP();
        boolean isEnded = this.A0r.A0G();
        if (isEnded) {
            boolean isEnded2 = this.A0r.A0I();
            return zAAP & isEnded2;
        }
        return zAAP;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.InterfaceC7381oo
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("D18870411: Adding start stall debug reason"), @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D69547806: Only become ready once we have a surface")})
    public final boolean AAe() {
        if (super.AAe() && !this.A0i && ((this.A0T == null || this.A0U != this.A0T) && A1j() != null && !this.A0k)) {
            ((AbstractC4905AE) this).A0B = EnumC7031ir.A08;
        }
        if (super.AAe() && (!this.A0r.A0G() || this.A0r.A0H())) {
            if (!this.A0h) {
                if (!this.A0i) {
                }
                this.A0M = -9223372036854775807L;
                return true;
            }
            Surface surface = this.A0U;
            if (A12[1].charAt(20) != 's') {
                throw new RuntimeException();
            }
            String[] strArr = A12;
            strArr[5] = "iOSBWWk";
            strArr[0] = "3hctIGW";
            if (surface != null) {
                if (!this.A0i || ((this.A0T != null && this.A0U == this.A0T) || A1j() == null || this.A0k)) {
                    this.A0M = -9223372036854775807L;
                    return true;
                }
            }
        }
        if (this.A0M == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.A0M) {
            return true;
        }
        this.A0M = -9223372036854775807L;
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC43981g, com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void AIX(long j, long j2) throws C4904AD {
        super.AIX(j, j2);
        if (this.A0r.A0G()) {
            this.A0r.A0B(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo, com.facebook.ads.redexgen.core.InterfaceC47747p
    public final String getName() {
        return A0B(682, 23, 0);
    }
}
