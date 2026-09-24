package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjl implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjp zzc;

    zzjl(zzjp zzjpVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzjpVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x044c A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0462 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x046d A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0471 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0473 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c9 A[Catch: all -> 0x052e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0202 A[Catch: SecurityException -> 0x0512, all -> 0x052e, TryCatch #0 {SecurityException -> 0x0512, blocks: (B:61:0x01fa, B:63:0x0202, B:65:0x0208), top: B:127:0x01fa, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0229 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x024e A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0266 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x026a A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0298 A[Catch: all -> 0x052e, LOOP:1: B:83:0x0292->B:85:0x0298, LOOP_END, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0334 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0355 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0391 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x03e7 A[Catch: all -> 0x052e, TryCatch #3 {all -> 0x052e, blocks: (B:9:0x0057, B:11:0x0062, B:14:0x007b, B:16:0x0081, B:17:0x0093, B:19:0x00aa, B:20:0x00b1, B:22:0x00bb, B:23:0x00c8, B:25:0x00d2, B:26:0x00df, B:28:0x00ea, B:29:0x00f2, B:31:0x010e, B:35:0x011b, B:37:0x0135, B:39:0x0145, B:41:0x014d, B:43:0x0153, B:44:0x0156, B:46:0x0165, B:48:0x016b, B:50:0x017d, B:52:0x0187, B:53:0x0198, B:55:0x019c, B:57:0x01a9, B:60:0x01c9, B:61:0x01fa, B:63:0x0202, B:65:0x0208, B:66:0x021f, B:68:0x0229, B:69:0x0236, B:70:0x0248, B:72:0x024e, B:79:0x0266, B:82:0x028b, B:83:0x0292, B:85:0x0298, B:86:0x02cc, B:88:0x0334, B:89:0x0348, B:91:0x0355, B:93:0x03aa, B:94:0x03e1, B:96:0x03e7, B:98:0x03fb, B:99:0x0406, B:101:0x044c, B:102:0x045a, B:104:0x0462, B:105:0x0465, B:107:0x046d, B:110:0x0476, B:113:0x048b, B:114:0x048e, B:109:0x0473, B:92:0x0391, B:81:0x026a, B:121:0x0513, B:32:0x0112, B:34:0x0118), top: B:133:0x0057, inners: #0, #1 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpv zzpvVar;
        String strZzC;
        zzpv zzpvVar2;
        List listZzE;
        Iterator it;
        zzqd zzqdVar;
        com.google.android.gms.internal.measurement.zzio[] zzioVarArr;
        int i;
        zzpv zzpvVar3;
        zzio zzioVar;
        Bundle bundle;
        String str;
        zzbd zzbdVarZzs;
        zzpv zzpvVar4;
        zzh zzhVar;
        Bundle bundle2;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Object obj;
        com.google.android.gms.internal.measurement.zzht zzhtVar;
        zzbd zzbdVarZzc;
        long j;
        com.google.android.gms.internal.measurement.zzhw zzhwVar2;
        com.google.android.gms.internal.measurement.zzhl zzhlVarZze;
        zzbf zzbfVar;
        zzbe zzbeVar;
        long jZzs;
        long jZzu;
        String strZzL;
        com.google.android.gms.internal.measurement.zzhp zzhpVarZze;
        Object objZzf;
        byte[] bArr2;
        zzjp zzjpVar = this.zzc;
        zzjpVar.zza.zzL();
        zzmc zzmcVarZzv = zzjpVar.zza.zzv();
        zzmcVarZzv.zzg();
        zzio zzioVar2 = zzmcVarZzv.zzu;
        zzio.zzP();
        zzbh zzbhVar = this.zza;
        Preconditions.checkNotNull(zzbhVar);
        String str2 = this.zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = zzbhVar.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzmcVarZzv.zzu.zzaW().zzd().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpv zzpvVar5 = zzmcVarZzv.zzg;
        com.google.android.gms.internal.measurement.zzht zzhtVarZzb = com.google.android.gms.internal.measurement.zzhv.zzb();
        zzpvVar5.zzj().zzH();
        try {
            zzh zzhVarZzl = zzpvVar5.zzj().zzl(str2);
            if (zzhVarZzl == null) {
                zzmcVarZzv.zzu.zzaW().zzd().zzb("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzl.zzaJ()) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVarZzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                    zzhwVarZzz.zzar(1);
                    zzhwVarZzz.zzan("android");
                    if (!TextUtils.isEmpty(zzhVarZzl.zzC())) {
                        zzhwVarZzz.zzI(zzhVarZzl.zzC());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzl.zzE())) {
                        zzhwVarZzz.zzK((String) Preconditions.checkNotNull(zzhVarZzl.zzE()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzl.zzF())) {
                        zzhwVarZzz.zzL((String) Preconditions.checkNotNull(zzhVarZzl.zzF()));
                    }
                    if (zzhVarZzl.zze() != -2147483648L) {
                        zzhwVarZzz.zzM((int) zzhVarZzl.zze());
                    }
                    zzhwVarZzz.zzai(zzhVarZzl.zzq());
                    zzhwVarZzz.zzZ(zzhVarZzl.zzo());
                    String strZzH = zzhVarZzl.zzH();
                    String strZzA = zzhVarZzl.zzA();
                    if (!TextUtils.isEmpty(strZzH)) {
                        zzhwVarZzz.zzah(strZzH);
                    } else if (!TextUtils.isEmpty(strZzA)) {
                        zzhwVarZzz.zzH(strZzA);
                    }
                    zzhwVarZzz.zzay(zzhVarZzl.zzw());
                    zzjx zzjxVarZzu = zzmcVarZzv.zzg.zzu(str2);
                    zzhwVarZzz.zzW(zzhVarZzl.zzn());
                    if (zzioVar2.zzJ() && zzmcVarZzv.zzu.zzf().zzy(zzhwVarZzz.zzaF()) && zzjxVarZzu.zzr(zzjw.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzhwVarZzz.zzY(null);
                    }
                    zzhwVarZzz.zzT(zzjxVarZzu.zzp());
                    if (zzjxVarZzu.zzr(zzjw.AD_STORAGE) && zzhVarZzl.zzaI()) {
                        Pair pairZzd = zzpvVar5.zzw().zzd(zzhVarZzl.zzC(), zzjxVarZzu);
                        if (!zzhVarZzl.zzaI() || TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                            zzio zzioVar3 = zzmcVarZzv.zzu;
                            zzioVar3.zzg().zzv();
                            zzhwVarZzz.zzX(Build.MODEL);
                            zzioVar3.zzg().zzv();
                            zzhwVarZzz.zzam(Build.VERSION.RELEASE);
                            zzhwVarZzz.zzaz((int) zzioVar3.zzg().zza());
                            zzhwVarZzz.zzaD(zzioVar3.zzg().zzb());
                            if (zzjxVarZzu.zzr(zzjw.ANALYTICS_STORAGE)) {
                                zzhwVarZzz.zzJ(zzmc.zza((String) Preconditions.checkNotNull(zzhVarZzl.zzD()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzl.zzG())) {
                                zzhwVarZzz.zzag((String) Preconditions.checkNotNull(zzhVarZzl.zzG()));
                            }
                            strZzC = zzhVarZzl.zzC();
                            zzpvVar2 = zzmcVarZzv.zzg;
                            listZzE = zzpvVar2.zzj().zzE(strZzC);
                            it = listZzE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (zzqd) it.next();
                            } while (!"_lte".equals(zzqdVar.zzc));
                            if (zzqdVar != null) {
                                zzqd zzqdVar2 = new zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar2);
                                zzpvVar2.zzj().zzai(zzqdVar2);
                            } else {
                                zzqd zzqdVar3 = new zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar3);
                                zzpvVar2.zzj().zzai(zzqdVar3);
                            }
                            zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                            for (i = 0; i < listZzE.size(); i++) {
                                com.google.android.gms.internal.measurement.zzin zzinVarZze = com.google.android.gms.internal.measurement.zzio.zze();
                                zzinVarZze.zzf(((zzqd) listZzE.get(i)).zzc);
                                zzinVarZze.zzg(((zzqd) listZzE.get(i)).zzd);
                                zzpvVar2.zzA().zzx(zzinVarZze, ((zzqd) listZzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze.zzba();
                            }
                            zzhwVarZzz.zzm(Arrays.asList(zzioVarArr));
                            zzpvVar3 = zzmcVarZzv.zzg;
                            zzpvVar3.zzQ(zzhVarZzl, zzhwVarZzz);
                            zzpvVar3.zzaa(zzhVarZzl, zzhwVarZzz);
                            zzhf zzhfVarZzb = zzhf.zzb(zzbhVar);
                            zzioVar = zzmcVarZzv.zzu;
                            zzqf zzqfVarZzw = zzioVar.zzw();
                            bundle = zzhfVarZzb.zzd;
                            zzqfVarZzw.zzO(bundle, zzpvVar2.zzj().zzk(str2));
                            zzioVar.zzw().zzQ(zzhfVarZzb, zzioVar.zzf().zzf(str2));
                            bundle.putLong("_c", 1L);
                            zzioVar.zzaW().zzd().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str4 = zzbhVar.zzc;
                            bundle.putString("_o", str4);
                            if (zzioVar.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                                zzioVar.zzw().zzS(bundle, "_dbg", 1L);
                                zzioVar.zzw().zzS(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj = zzpvVar2.zzj();
                            str = zzbhVar.zza;
                            zzbdVarZzs = zzawVarZzj.zzs(str2, str);
                            if (zzbdVarZzs == null) {
                                bundle2 = bundle;
                                zzhVar = zzhVarZzl;
                                obj = null;
                                zzpvVar4 = zzpvVar3;
                                zzhwVar = zzhwVarZzz;
                                zzbdVarZzc = new zzbd(str2, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhtVar = zzhtVarZzb;
                            } else {
                                zzpvVar4 = zzpvVar3;
                                zzhVar = zzhVarZzl;
                                bundle2 = bundle;
                                zzhwVar = zzhwVarZzz;
                                obj = null;
                                zzhtVar = zzhtVarZzb;
                                long j2 = zzbdVarZzs.zzf;
                                zzbdVarZzc = zzbdVarZzs.zzc(zzbhVar.zzd);
                                j = j2;
                            }
                            zzpvVar2.zzj().zzV(zzbdVarZzc);
                            zzhwVar2 = zzhwVar;
                            zzh zzhVar2 = zzhVar;
                            zzbc zzbcVar = new zzbc(zzmcVarZzv.zzu, str4, str2, str, zzbhVar.zzd, j, bundle2);
                            zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                            zzhlVarZze.zzm(zzbcVar.zzd);
                            zzhlVarZze.zzi(zzbcVar.zzb);
                            zzhlVarZze.zzl(zzbcVar.zze);
                            zzbfVar = zzbcVar.zzf;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next = zzbeVar.next();
                                String str5 = next;
                                zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze.zzj(next);
                                objZzf = zzbfVar.zzf(next);
                                if (objZzf != null) {
                                    zzpvVar2.zzA().zzw(zzhpVarZze, objZzf);
                                    zzhlVarZze.zze(zzhpVarZze);
                                }
                            }
                            zzhwVar2.zzn(zzhlVarZze);
                            com.google.android.gms.internal.measurement.zzhy zzhyVarZza = com.google.android.gms.internal.measurement.zzia.zza();
                            com.google.android.gms.internal.measurement.zzhn zzhnVarZza = com.google.android.gms.internal.measurement.zzho.zza();
                            zzhnVarZza.zza(zzbdVarZzc.zzc);
                            zzhnVarZza.zzb(str);
                            zzhyVarZza.zza(zzhnVarZza);
                            zzhwVar2.zzao(zzhyVarZza);
                            zzhwVar2.zzi(zzpvVar2.zzh().zza(zzhVar2.zzC(), Collections.EMPTY_LIST, zzhwVar2.zzaN(), Long.valueOf(zzhlVarZze.zzc()), Long.valueOf(zzhlVarZze.zzc()), false));
                            if (zzhlVarZze.zzq()) {
                                zzhwVar2.zzax(zzhlVarZze.zzc());
                                zzhwVar2.zzab(zzhlVarZze.zzc());
                            }
                            jZzs = zzhVar2.zzs();
                            if (jZzs != 0) {
                                zzhwVar2.zzap(jZzs);
                            }
                            jZzu = zzhVar2.zzu();
                            if (jZzu != 0) {
                                zzhwVar2.zzaq(jZzu);
                            } else if (jZzs != 0) {
                                zzhwVar2.zzaq(jZzs);
                            }
                            strZzL = zzhVar2.zzL();
                            zzrd.zzb();
                            if (zzioVar.zzf().zzx(str2, zzgi.zzaL)) {
                                zzhwVar2.zzav(strZzL);
                            }
                            zzhVar2.zzP();
                            zzhwVar2.zzP((int) zzhVar2.zzt());
                            zzioVar.zzf().zzj();
                            zzhwVar2.zzaB(119002L);
                            zzhwVar2.zzaA(zzioVar.zzaU().currentTimeMillis());
                            zzhwVar2.zzau(Boolean.TRUE.booleanValue());
                            zzpvVar4.zzN(zzhwVar2.zzaF(), zzhwVar2);
                            zzhtVar.zzc(zzhwVar2);
                            zzhVar2.zzau(zzhwVar2.zzf());
                            zzhVar2.zzas(zzhwVar2.zze());
                            zzpvVar2.zzj().zzT(zzhVar2, false, false);
                            zzpvVar2.zzj().zzS();
                            zzpvVar2.zzj().zzL();
                            return zzpvVar2.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba()).zzcd());
                        }
                        try {
                            zzhwVarZzz.zzas(zzmc.zza((String) pairZzd.first, Long.toString(zzbhVar.zzd)));
                            if (pairZzd.second != null) {
                                zzhwVarZzz.zzal(((Boolean) pairZzd.second).booleanValue());
                            }
                            zzio zzioVar4 = zzmcVarZzv.zzu;
                            zzioVar4.zzg().zzv();
                            zzhwVarZzz.zzX(Build.MODEL);
                            zzioVar4.zzg().zzv();
                            zzhwVarZzz.zzam(Build.VERSION.RELEASE);
                            zzhwVarZzz.zzaz((int) zzioVar4.zzg().zza());
                            zzhwVarZzz.zzaD(zzioVar4.zzg().zzb());
                            if (zzjxVarZzu.zzr(zzjw.ANALYTICS_STORAGE)) {
                                zzhwVarZzz.zzJ(zzmc.zza((String) Preconditions.checkNotNull(zzhVarZzl.zzD()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzl.zzG())) {
                                zzhwVarZzz.zzag((String) Preconditions.checkNotNull(zzhVarZzl.zzG()));
                            }
                            strZzC = zzhVarZzl.zzC();
                            zzpvVar2 = zzmcVarZzv.zzg;
                            listZzE = zzpvVar2.zzj().zzE(strZzC);
                            it = listZzE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (zzqd) it.next();
                            } while (!"_lte".equals(zzqdVar.zzc));
                            if (zzqdVar != null) {
                                zzqd zzqdVar4 = new zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar4);
                                zzpvVar2.zzj().zzai(zzqdVar4);
                            } else {
                                zzqd zzqdVar5 = new zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar5);
                                zzpvVar2.zzj().zzai(zzqdVar5);
                            }
                            zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                            while (i < listZzE.size()) {
                                com.google.android.gms.internal.measurement.zzin zzinVarZze2 = com.google.android.gms.internal.measurement.zzio.zze();
                                zzinVarZze2.zzf(((zzqd) listZzE.get(i)).zzc);
                                zzinVarZze2.zzg(((zzqd) listZzE.get(i)).zzd);
                                zzpvVar2.zzA().zzx(zzinVarZze2, ((zzqd) listZzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze2.zzba();
                            }
                            zzhwVarZzz.zzm(Arrays.asList(zzioVarArr));
                            zzpvVar3 = zzmcVarZzv.zzg;
                            zzpvVar3.zzQ(zzhVarZzl, zzhwVarZzz);
                            zzpvVar3.zzaa(zzhVarZzl, zzhwVarZzz);
                            zzhf zzhfVarZzb2 = zzhf.zzb(zzbhVar);
                            zzioVar = zzmcVarZzv.zzu;
                            zzqf zzqfVarZzw2 = zzioVar.zzw();
                            bundle = zzhfVarZzb2.zzd;
                            zzqfVarZzw2.zzO(bundle, zzpvVar2.zzj().zzk(str2));
                            zzioVar.zzw().zzQ(zzhfVarZzb2, zzioVar.zzf().zzf(str2));
                            bundle.putLong("_c", 1L);
                            zzioVar.zzaW().zzd().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str6 = zzbhVar.zzc;
                            bundle.putString("_o", str6);
                            if (zzioVar.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                                zzioVar.zzw().zzS(bundle, "_dbg", 1L);
                                zzioVar.zzw().zzS(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj2 = zzpvVar2.zzj();
                            str = zzbhVar.zza;
                            zzbdVarZzs = zzawVarZzj2.zzs(str2, str);
                            if (zzbdVarZzs == null) {
                                bundle2 = bundle;
                                zzhVar = zzhVarZzl;
                                obj = null;
                                zzpvVar4 = zzpvVar3;
                                zzhwVar = zzhwVarZzz;
                                zzbdVarZzc = new zzbd(str2, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhtVar = zzhtVarZzb;
                            } else {
                                zzpvVar4 = zzpvVar3;
                                zzhVar = zzhVarZzl;
                                bundle2 = bundle;
                                zzhwVar = zzhwVarZzz;
                                obj = null;
                                zzhtVar = zzhtVarZzb;
                                long j3 = zzbdVarZzs.zzf;
                                zzbdVarZzc = zzbdVarZzs.zzc(zzbhVar.zzd);
                                j = j3;
                            }
                            zzpvVar2.zzj().zzV(zzbdVarZzc);
                            zzhwVar2 = zzhwVar;
                            zzh zzhVar3 = zzhVar;
                            zzbc zzbcVar2 = new zzbc(zzmcVarZzv.zzu, str6, str2, str, zzbhVar.zzd, j, bundle2);
                            zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                            zzhlVarZze.zzm(zzbcVar2.zzd);
                            zzhlVarZze.zzi(zzbcVar2.zzb);
                            zzhlVarZze.zzl(zzbcVar2.zze);
                            zzbfVar = zzbcVar2.zzf;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next2 = zzbeVar.next();
                                String str7 = next2;
                                zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze.zzj(next2);
                                objZzf = zzbfVar.zzf(next2);
                                if (objZzf != null) {
                                    zzpvVar2.zzA().zzw(zzhpVarZze, objZzf);
                                    zzhlVarZze.zze(zzhpVarZze);
                                }
                            }
                            zzhwVar2.zzn(zzhlVarZze);
                            com.google.android.gms.internal.measurement.zzhy zzhyVarZza2 = com.google.android.gms.internal.measurement.zzia.zza();
                            com.google.android.gms.internal.measurement.zzhn zzhnVarZza2 = com.google.android.gms.internal.measurement.zzho.zza();
                            zzhnVarZza2.zza(zzbdVarZzc.zzc);
                            zzhnVarZza2.zzb(str);
                            zzhyVarZza2.zza(zzhnVarZza2);
                            zzhwVar2.zzao(zzhyVarZza2);
                            zzhwVar2.zzi(zzpvVar2.zzh().zza(zzhVar3.zzC(), Collections.EMPTY_LIST, zzhwVar2.zzaN(), Long.valueOf(zzhlVarZze.zzc()), Long.valueOf(zzhlVarZze.zzc()), false));
                            if (zzhlVarZze.zzq()) {
                                zzhwVar2.zzax(zzhlVarZze.zzc());
                                zzhwVar2.zzab(zzhlVarZze.zzc());
                            }
                            jZzs = zzhVar3.zzs();
                            if (jZzs != 0) {
                                zzhwVar2.zzap(jZzs);
                            }
                            jZzu = zzhVar3.zzu();
                            if (jZzu != 0) {
                                zzhwVar2.zzaq(jZzu);
                            } else if (jZzs != 0) {
                                zzhwVar2.zzaq(jZzs);
                            }
                            strZzL = zzhVar3.zzL();
                            zzrd.zzb();
                            if (zzioVar.zzf().zzx(str2, zzgi.zzaL)) {
                                zzhwVar2.zzav(strZzL);
                            }
                            zzhVar3.zzP();
                            zzhwVar2.zzP((int) zzhVar3.zzt());
                            zzioVar.zzf().zzj();
                            zzhwVar2.zzaB(119002L);
                            zzhwVar2.zzaA(zzioVar.zzaU().currentTimeMillis());
                            zzhwVar2.zzau(Boolean.TRUE.booleanValue());
                            zzpvVar4.zzN(zzhwVar2.zzaF(), zzhwVar2);
                            zzhtVar.zzc(zzhwVar2);
                            zzhVar3.zzau(zzhwVar2.zzf());
                            zzhVar3.zzas(zzhwVar2.zze());
                            zzpvVar2.zzj().zzT(zzhVar3, false, false);
                            zzpvVar2.zzj().zzS();
                            zzpvVar2.zzj().zzL();
                            return zzpvVar2.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba()).zzcd());
                        } catch (SecurityException e) {
                            zzmcVarZzv.zzu.zzaW().zzd().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzpvVar = zzmcVarZzv.zzg;
                        }
                    } else {
                        zzio zzioVar5 = zzmcVarZzv.zzu;
                        zzioVar5.zzg().zzv();
                        zzhwVarZzz.zzX(Build.MODEL);
                        zzioVar5.zzg().zzv();
                        zzhwVarZzz.zzam(Build.VERSION.RELEASE);
                        zzhwVarZzz.zzaz((int) zzioVar5.zzg().zza());
                        zzhwVarZzz.zzaD(zzioVar5.zzg().zzb());
                        try {
                            if (zzjxVarZzu.zzr(zzjw.ANALYTICS_STORAGE) && zzhVarZzl.zzD() != null) {
                                zzhwVarZzz.zzJ(zzmc.zza((String) Preconditions.checkNotNull(zzhVarZzl.zzD()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzl.zzG())) {
                                zzhwVarZzz.zzag((String) Preconditions.checkNotNull(zzhVarZzl.zzG()));
                            }
                            strZzC = zzhVarZzl.zzC();
                            zzpvVar2 = zzmcVarZzv.zzg;
                            listZzE = zzpvVar2.zzj().zzE(strZzC);
                            it = listZzE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (zzqd) it.next();
                            } while (!"_lte".equals(zzqdVar.zzc));
                            if (zzqdVar != null || zzqdVar.zze == null) {
                                zzqd zzqdVar6 = new zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar6);
                                zzpvVar2.zzj().zzai(zzqdVar6);
                            }
                            zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                            while (i < listZzE.size()) {
                                com.google.android.gms.internal.measurement.zzin zzinVarZze3 = com.google.android.gms.internal.measurement.zzio.zze();
                                zzinVarZze3.zzf(((zzqd) listZzE.get(i)).zzc);
                                zzinVarZze3.zzg(((zzqd) listZzE.get(i)).zzd);
                                zzpvVar2.zzA().zzx(zzinVarZze3, ((zzqd) listZzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze3.zzba();
                            }
                            zzhwVarZzz.zzm(Arrays.asList(zzioVarArr));
                            zzpvVar3 = zzmcVarZzv.zzg;
                            zzpvVar3.zzQ(zzhVarZzl, zzhwVarZzz);
                            zzpvVar3.zzaa(zzhVarZzl, zzhwVarZzz);
                            zzhf zzhfVarZzb3 = zzhf.zzb(zzbhVar);
                            zzioVar = zzmcVarZzv.zzu;
                            zzqf zzqfVarZzw3 = zzioVar.zzw();
                            bundle = zzhfVarZzb3.zzd;
                            zzqfVarZzw3.zzO(bundle, zzpvVar2.zzj().zzk(str2));
                            zzioVar.zzw().zzQ(zzhfVarZzb3, zzioVar.zzf().zzf(str2));
                            bundle.putLong("_c", 1L);
                            zzioVar.zzaW().zzd().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str8 = zzbhVar.zzc;
                            bundle.putString("_o", str8);
                            if (zzioVar.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                                zzioVar.zzw().zzS(bundle, "_dbg", 1L);
                                zzioVar.zzw().zzS(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj3 = zzpvVar2.zzj();
                            str = zzbhVar.zza;
                            zzbdVarZzs = zzawVarZzj3.zzs(str2, str);
                            if (zzbdVarZzs == null) {
                                bundle2 = bundle;
                                zzhVar = zzhVarZzl;
                                obj = null;
                                zzpvVar4 = zzpvVar3;
                                zzhwVar = zzhwVarZzz;
                                zzbdVarZzc = new zzbd(str2, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhtVar = zzhtVarZzb;
                            } else {
                                zzpvVar4 = zzpvVar3;
                                zzhVar = zzhVarZzl;
                                bundle2 = bundle;
                                zzhwVar = zzhwVarZzz;
                                obj = null;
                                zzhtVar = zzhtVarZzb;
                                long j4 = zzbdVarZzs.zzf;
                                zzbdVarZzc = zzbdVarZzs.zzc(zzbhVar.zzd);
                                j = j4;
                            }
                            zzpvVar2.zzj().zzV(zzbdVarZzc);
                            zzhwVar2 = zzhwVar;
                            zzh zzhVar4 = zzhVar;
                            zzbc zzbcVar3 = new zzbc(zzmcVarZzv.zzu, str8, str2, str, zzbhVar.zzd, j, bundle2);
                            zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                            zzhlVarZze.zzm(zzbcVar3.zzd);
                            zzhlVarZze.zzi(zzbcVar3.zzb);
                            zzhlVarZze.zzl(zzbcVar3.zze);
                            zzbfVar = zzbcVar3.zzf;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next3 = zzbeVar.next();
                                String str9 = next3;
                                zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze.zzj(next3);
                                objZzf = zzbfVar.zzf(next3);
                                if (objZzf != null) {
                                    zzpvVar2.zzA().zzw(zzhpVarZze, objZzf);
                                    zzhlVarZze.zze(zzhpVarZze);
                                }
                            }
                            zzhwVar2.zzn(zzhlVarZze);
                            com.google.android.gms.internal.measurement.zzhy zzhyVarZza3 = com.google.android.gms.internal.measurement.zzia.zza();
                            com.google.android.gms.internal.measurement.zzhn zzhnVarZza3 = com.google.android.gms.internal.measurement.zzho.zza();
                            zzhnVarZza3.zza(zzbdVarZzc.zzc);
                            zzhnVarZza3.zzb(str);
                            zzhyVarZza3.zza(zzhnVarZza3);
                            zzhwVar2.zzao(zzhyVarZza3);
                            zzhwVar2.zzi(zzpvVar2.zzh().zza(zzhVar4.zzC(), Collections.EMPTY_LIST, zzhwVar2.zzaN(), Long.valueOf(zzhlVarZze.zzc()), Long.valueOf(zzhlVarZze.zzc()), false));
                            if (zzhlVarZze.zzq()) {
                                zzhwVar2.zzax(zzhlVarZze.zzc());
                                zzhwVar2.zzab(zzhlVarZze.zzc());
                            }
                            jZzs = zzhVar4.zzs();
                            if (jZzs != 0) {
                                zzhwVar2.zzap(jZzs);
                            }
                            jZzu = zzhVar4.zzu();
                            if (jZzu != 0) {
                                zzhwVar2.zzaq(jZzu);
                            } else if (jZzs != 0) {
                                zzhwVar2.zzaq(jZzs);
                            }
                            strZzL = zzhVar4.zzL();
                            zzrd.zzb();
                            if (zzioVar.zzf().zzx(str2, zzgi.zzaL) && strZzL != null) {
                                zzhwVar2.zzav(strZzL);
                            }
                            zzhVar4.zzP();
                            zzhwVar2.zzP((int) zzhVar4.zzt());
                            zzioVar.zzf().zzj();
                            zzhwVar2.zzaB(119002L);
                            zzhwVar2.zzaA(zzioVar.zzaU().currentTimeMillis());
                            zzhwVar2.zzau(Boolean.TRUE.booleanValue());
                            zzpvVar4.zzN(zzhwVar2.zzaF(), zzhwVar2);
                            zzhtVar.zzc(zzhwVar2);
                            zzhVar4.zzau(zzhwVar2.zzf());
                            zzhVar4.zzas(zzhwVar2.zze());
                            zzpvVar2.zzj().zzT(zzhVar4, false, false);
                            zzpvVar2.zzj().zzS();
                            zzpvVar2.zzj().zzL();
                            try {
                                return zzpvVar2.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba()).zzcd());
                            } catch (IOException e2) {
                                zzmcVarZzv.zzu.zzaW().zze().zzc("Data loss. Failed to bundle and serialize. appId", zzhe.zzn(str2), e2);
                                return obj;
                            }
                        } catch (SecurityException e3) {
                            zzmcVarZzv.zzu.zzaW().zzd().zzb("app instance id encryption failed", e3.getMessage());
                            bArr = new byte[0];
                            zzpvVar = zzmcVarZzv.zzg;
                        }
                    }
                    zzpvVar.zzj().zzL();
                    return bArr;
                }
                zzmcVarZzv.zzu.zzaW().zzd().zzb("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            zzpvVar5.zzj().zzL();
            return bArr2;
        } catch (Throwable th) {
            zzmcVarZzv.zzg.zzj().zzL();
            throw th;
        }
    }
}
