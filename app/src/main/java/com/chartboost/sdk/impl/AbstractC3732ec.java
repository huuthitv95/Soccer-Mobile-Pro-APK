package com.chartboost.sdk.impl;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.C11744X3;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ec */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3732ec {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ec$a */
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14066b;

        /* JADX INFO: renamed from: c */
        public Object f14067c;

        /* JADX INFO: renamed from: d */
        public Object f14068d;

        /* JADX INFO: renamed from: e */
        public long f14069e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f14070f;

        /* JADX INFO: renamed from: g */
        public int f14071g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14070f = obj;
            this.f14071g |= Integer.MIN_VALUE;
            return AbstractC3732ec.m17542b((URL) null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Integer m17538a(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Integer.valueOf(mediaFormat.getInteger(str));
            }
            return null;
        } catch (Exception e) {
            C4048sb.m19414d("Failed to get integer value for key " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List m17540a(String str) {
        ChartboostError unsupportedCodec;
        try {
            File file = new File(str);
            if (!file.exists()) {
                C4048sb.m19417e("File does not exist: " + str, null, 2, null);
                return CollectionsKt.emptyList();
            }
            if (!file.canRead()) {
                C4048sb.m19417e("Cannot read file: " + str, null, 2, null);
                return CollectionsKt.emptyList();
            }
            C4048sb.m19408a("Attempting to extract codecs from: " + str + " (" + file.length() + " bytes)", (Throwable) null, 2, (Object) null);
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                C4048sb.m19408a("MediaExtractor found " + trackCount + " tracks", (Throwable) null, 2, (Object) null);
                if (trackCount == 0) {
                    C4048sb.m19417e("No tracks found in media file", null, 2, null);
                    List listEmptyList = CollectionsKt.emptyList();
                    mediaExtractor.release();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < trackCount; i++) {
                    try {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                        String string = trackFormat.getString("mime");
                        if (string != null) {
                            arrayList.add(string);
                            C4048sb.m19415d("Track " + i + ": Found codec: " + string, null, 2, null);
                            C4048sb.m19415d("  Duration: " + m17541b(trackFormat, "durationUs") + ", Bitrate: " + m17538a(trackFormat, "bitrate"), null, 2, null);
                        } else {
                            C4048sb.m19415d("Track " + i + ": No MIME type found", null, 2, null);
                        }
                    } catch (Exception e) {
                        ChartboostError.Load.UnsupportedCodec unsupportedCodec2 = new ChartboostError.Load.UnsupportedCodec("Failed to extract codec info for track " + i + ": " + e.getMessage(), e);
                        C4048sb.m19416e(C11744X3.j.f26438d + unsupportedCodec2.getCode() + "] Failed to get format for track " + i, unsupportedCodec2);
                    }
                }
                mediaExtractor.release();
                return arrayList;
            } catch (Throwable th) {
                mediaExtractor.release();
                throw th;
            }
        } catch (Exception e2) {
            if (e2 instanceof IOException) {
                unsupportedCodec = new ChartboostError.Load.AssetUnavailable(str, "Failed to read media file: " + e2.getMessage(), e2);
            } else if (e2 instanceof IllegalArgumentException) {
                unsupportedCodec = new ChartboostError.Load.InvalidAssetUrl(str, "Invalid media file path: " + e2.getMessage(), e2);
            } else {
                unsupportedCodec = new ChartboostError.Load.UnsupportedCodec("Failed to extract codecs from media file: " + e2.getMessage(), e2);
            }
            C4048sb.m19416e(C11744X3.j.f26438d + unsupportedCodec.getCode() + "] Failed to extract codecs from " + str, unsupportedCodec);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Long m17541b(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Long.valueOf(mediaFormat.getLong(str));
            }
            return null;
        } catch (Exception e) {
            C4048sb.m19414d("Failed to get long value for key " + str, e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x0105 A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:33:0x012d A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0133  */
    /* JADX WARN: Code duplicated, block: B:38:0x0138 A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0154 A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:41:0x015a A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0174 A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017e A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0187 A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01bc A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f1 A[Catch: Exception -> 0x0220, TRY_LEAVE, TryCatch #0 {Exception -> 0x0220, blocks: (B:30:0x00ff, B:32:0x0105, B:33:0x012d, B:36:0x0134, B:38:0x0138, B:39:0x0154, B:41:0x015a, B:42:0x0174, B:44:0x017e, B:45:0x0187, B:47:0x01bc, B:51:0x01f1), top: B:86:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.chartboost.sdk.impl.x6] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.chartboost.sdk.impl.x6] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.chartboost.sdk.impl.x6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.chartboost.sdk.impl.ec$a] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.net.URL] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.chartboost.sdk.impl.ec$a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.chartboost.sdk.impl.ec$a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f7 -> B:86:0x00ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m17542b(java.net.URL r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.AbstractC3732ec.m17542b(java.net.URL, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static final Object m17543c(URL url, Continuation continuation) {
        return m17542b(url, continuation);
    }
}
