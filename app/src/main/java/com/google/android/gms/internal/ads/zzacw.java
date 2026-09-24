package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.zxing.pdf417.PDF417Common;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.p300io.encoding.Base64;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacw extends zzvl implements zzadl {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private zznb zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private zzbv zzL;
    private zzbv zzM;
    private int zzN;
    private int zzO;
    private zzadj zzP;
    private long zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final Context zze;
    private final boolean zzf;
    private final zzaeg zzg;
    private final boolean zzh;
    private final zzadm zzi;
    private final zzadk zzj;
    private final zzacf zzk;
    private final long zzl;
    private final zzadn zzm;
    private final PriorityQueue zzn;
    private zzacv zzo;
    private boolean zzp;
    private boolean zzq;
    private zzaem zzr;
    private boolean zzs;
    private int zzt;
    private List zzu;
    private Surface zzv;
    private zzacy zzw;
    private zzet zzx;
    private boolean zzy;
    private int zzz;

    protected zzacw(zzacu zzacuVar) {
        super(zzacuVar.zze().getApplicationContext(), 2, zzacuVar.zzg(), zzacuVar.zzf(), false, 30.0f);
        Context applicationContext = zzacuVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new zzaeg(zzacuVar.zzh(), zzacuVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new zzadm(applicationContext, this, 0L);
        this.zzj = new zzadk();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzx = zzet.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = -1000;
        this.zzQ = -9223372036854775807L;
        this.zzR = -9223372036854775807L;
        this.zzk = new zzacf();
        this.zzn = new PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new zzadn(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public static int zzaw(zzve zzveVar, zzv zzvVar) {
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        if (i != -1 && i2 != -1) {
            String str = zzvVar.zzp;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairZze = zzdp.zze(zzvVar);
                if (pairZze == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairZze.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            int i3 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / i3;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    if (!"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zzveVar.zzf)))) {
                        String str2 = zzfk.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    private final void zzbA() {
        zzacy zzacyVar = this.zzw;
        if (zzacyVar != null) {
            zzacyVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* JADX INFO: renamed from: zzbB, reason: merged with bridge method [inline-methods] */
    public final void zzbo() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbC() {
        zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbm(zzve zzveVar, zzv zzvVar) {
        int i = zzvVar.zzq;
        if (i == -1) {
            return zzaw(zzveVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0148  */
    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0154  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:106:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x0164  */
    /* JADX WARN: Code duplicated, block: B:109:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:112:0x0178  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0184  */
    /* JADX WARN: Code duplicated, block: B:116:0x0188  */
    /* JADX WARN: Code duplicated, block: B:118:0x0190  */
    /* JADX WARN: Code duplicated, block: B:119:0x0194  */
    /* JADX WARN: Code duplicated, block: B:121:0x019c  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x0200  */
    /* JADX WARN: Code duplicated, block: B:148:0x0208  */
    /* JADX WARN: Code duplicated, block: B:149:0x020c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0214  */
    /* JADX WARN: Code duplicated, block: B:152:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x0220  */
    /* JADX WARN: Code duplicated, block: B:155:0x0224  */
    /* JADX WARN: Code duplicated, block: B:157:0x022c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0230  */
    /* JADX WARN: Code duplicated, block: B:160:0x0238  */
    /* JADX WARN: Code duplicated, block: B:161:0x023c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0244  */
    /* JADX WARN: Code duplicated, block: B:164:0x0248  */
    /* JADX WARN: Code duplicated, block: B:166:0x0250  */
    /* JADX WARN: Code duplicated, block: B:167:0x0254  */
    /* JADX WARN: Code duplicated, block: B:169:0x025c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0260  */
    /* JADX WARN: Code duplicated, block: B:172:0x0268  */
    /* JADX WARN: Code duplicated, block: B:173:0x026c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0274  */
    /* JADX WARN: Code duplicated, block: B:176:0x0278  */
    /* JADX WARN: Code duplicated, block: B:178:0x0280  */
    /* JADX WARN: Code duplicated, block: B:179:0x0284  */
    /* JADX WARN: Code duplicated, block: B:181:0x028c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0290  */
    /* JADX WARN: Code duplicated, block: B:184:0x0298  */
    /* JADX WARN: Code duplicated, block: B:185:0x029c  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:209:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:211:0x0303  */
    /* JADX WARN: Code duplicated, block: B:212:0x0307  */
    /* JADX WARN: Code duplicated, block: B:214:0x030f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0313  */
    /* JADX WARN: Code duplicated, block: B:217:0x031b  */
    /* JADX WARN: Code duplicated, block: B:218:0x031f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0327  */
    /* JADX WARN: Code duplicated, block: B:221:0x032b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0333  */
    /* JADX WARN: Code duplicated, block: B:224:0x0337  */
    /* JADX WARN: Code duplicated, block: B:226:0x033f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0343  */
    /* JADX WARN: Code duplicated, block: B:229:0x034b  */
    /* JADX WARN: Code duplicated, block: B:230:0x034f  */
    /* JADX WARN: Code duplicated, block: B:232:0x0357  */
    /* JADX WARN: Code duplicated, block: B:233:0x035b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0363  */
    /* JADX WARN: Code duplicated, block: B:236:0x0367  */
    /* JADX WARN: Code duplicated, block: B:238:0x036f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0373  */
    /* JADX WARN: Code duplicated, block: B:241:0x037b  */
    /* JADX WARN: Code duplicated, block: B:242:0x037f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0387  */
    /* JADX WARN: Code duplicated, block: B:245:0x038b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0393  */
    /* JADX WARN: Code duplicated, block: B:248:0x0397  */
    /* JADX WARN: Code duplicated, block: B:250:0x039f  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:254:0x03af  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:257:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:266:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:271:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:274:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:275:0x0400  */
    /* JADX WARN: Code duplicated, block: B:277:0x0408  */
    /* JADX WARN: Code duplicated, block: B:278:0x040c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0414  */
    /* JADX WARN: Code duplicated, block: B:281:0x0418  */
    /* JADX WARN: Code duplicated, block: B:283:0x0420  */
    /* JADX WARN: Code duplicated, block: B:284:0x0424  */
    /* JADX WARN: Code duplicated, block: B:286:0x042c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0430  */
    /* JADX WARN: Code duplicated, block: B:289:0x0438  */
    /* JADX WARN: Code duplicated, block: B:290:0x043c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0444  */
    /* JADX WARN: Code duplicated, block: B:293:0x0448  */
    /* JADX WARN: Code duplicated, block: B:295:0x0450  */
    /* JADX WARN: Code duplicated, block: B:296:0x0454  */
    /* JADX WARN: Code duplicated, block: B:298:0x045c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0460  */
    /* JADX WARN: Code duplicated, block: B:301:0x0468  */
    /* JADX WARN: Code duplicated, block: B:302:0x046c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0474  */
    /* JADX WARN: Code duplicated, block: B:305:0x0478  */
    /* JADX WARN: Code duplicated, block: B:307:0x0480  */
    /* JADX WARN: Code duplicated, block: B:308:0x0484  */
    /* JADX WARN: Code duplicated, block: B:310:0x048c  */
    /* JADX WARN: Code duplicated, block: B:311:0x0490  */
    /* JADX WARN: Code duplicated, block: B:313:0x0498  */
    /* JADX WARN: Code duplicated, block: B:314:0x049b  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:319:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:320:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:322:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:323:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:326:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:328:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:329:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:331:0x04da  */
    /* JADX WARN: Code duplicated, block: B:332:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:337:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:340:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:341:0x0501  */
    /* JADX WARN: Code duplicated, block: B:343:0x0509  */
    /* JADX WARN: Code duplicated, block: B:344:0x050d  */
    /* JADX WARN: Code duplicated, block: B:346:0x0515  */
    /* JADX WARN: Code duplicated, block: B:347:0x0519  */
    /* JADX WARN: Code duplicated, block: B:349:0x0521  */
    /* JADX WARN: Code duplicated, block: B:350:0x0525  */
    /* JADX WARN: Code duplicated, block: B:352:0x052d  */
    /* JADX WARN: Code duplicated, block: B:353:0x0531  */
    /* JADX WARN: Code duplicated, block: B:355:0x0539  */
    /* JADX WARN: Code duplicated, block: B:356:0x053d  */
    /* JADX WARN: Code duplicated, block: B:358:0x0545  */
    /* JADX WARN: Code duplicated, block: B:359:0x0549  */
    /* JADX WARN: Code duplicated, block: B:361:0x0551  */
    /* JADX WARN: Code duplicated, block: B:362:0x0555  */
    /* JADX WARN: Code duplicated, block: B:364:0x055d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0561  */
    /* JADX WARN: Code duplicated, block: B:367:0x0569  */
    /* JADX WARN: Code duplicated, block: B:368:0x056d  */
    /* JADX WARN: Code duplicated, block: B:370:0x0575  */
    /* JADX WARN: Code duplicated, block: B:371:0x0579  */
    /* JADX WARN: Code duplicated, block: B:373:0x0581  */
    /* JADX WARN: Code duplicated, block: B:374:0x0585  */
    /* JADX WARN: Code duplicated, block: B:376:0x058d  */
    /* JADX WARN: Code duplicated, block: B:377:0x0591  */
    /* JADX WARN: Code duplicated, block: B:379:0x0599  */
    /* JADX WARN: Code duplicated, block: B:380:0x059d  */
    /* JADX WARN: Code duplicated, block: B:382:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:385:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:388:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:389:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:391:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:392:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:394:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:395:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:397:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:400:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:401:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:403:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:404:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:406:0x0605  */
    /* JADX WARN: Code duplicated, block: B:407:0x0609  */
    /* JADX WARN: Code duplicated, block: B:409:0x0611  */
    /* JADX WARN: Code duplicated, block: B:410:0x0615  */
    /* JADX WARN: Code duplicated, block: B:412:0x061d  */
    /* JADX WARN: Code duplicated, block: B:413:0x0621  */
    /* JADX WARN: Code duplicated, block: B:415:0x0629  */
    /* JADX WARN: Code duplicated, block: B:416:0x062d  */
    /* JADX WARN: Code duplicated, block: B:418:0x0635  */
    /* JADX WARN: Code duplicated, block: B:419:0x0639  */
    /* JADX WARN: Code duplicated, block: B:421:0x0641  */
    /* JADX WARN: Code duplicated, block: B:422:0x0645  */
    /* JADX WARN: Code duplicated, block: B:424:0x064d  */
    /* JADX WARN: Code duplicated, block: B:425:0x0651  */
    /* JADX WARN: Code duplicated, block: B:427:0x0659  */
    /* JADX WARN: Code duplicated, block: B:428:0x065c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:430:0x0664  */
    /* JADX WARN: Code duplicated, block: B:431:0x0667  */
    /* JADX WARN: Code duplicated, block: B:433:0x066f  */
    /* JADX WARN: Code duplicated, block: B:434:0x0673  */
    /* JADX WARN: Code duplicated, block: B:436:0x067b  */
    /* JADX WARN: Code duplicated, block: B:437:0x067f  */
    /* JADX WARN: Code duplicated, block: B:439:0x0687  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[Catch: all -> 0x07ac, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:516:0x07a8, B:10:0x0013, B:12:0x0021, B:515:0x07a4, B:43:0x0083, B:45:0x0089, B:48:0x0094, B:81:0x00ff, B:83:0x0105, B:508:0x078e), top: B:522:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:440:0x068b  */
    /* JADX WARN: Code duplicated, block: B:442:0x0693  */
    /* JADX WARN: Code duplicated, block: B:443:0x0697  */
    /* JADX WARN: Code duplicated, block: B:445:0x069f  */
    /* JADX WARN: Code duplicated, block: B:446:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:448:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:449:0x06af  */
    /* JADX WARN: Code duplicated, block: B:451:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:452:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:454:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:457:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:458:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:460:0x06db  */
    /* JADX WARN: Code duplicated, block: B:461:0x06df  */
    /* JADX WARN: Code duplicated, block: B:463:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:464:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:466:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:469:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:470:0x0703  */
    /* JADX WARN: Code duplicated, block: B:472:0x070b  */
    /* JADX WARN: Code duplicated, block: B:473:0x070f  */
    /* JADX WARN: Code duplicated, block: B:475:0x0717  */
    /* JADX WARN: Code duplicated, block: B:476:0x071b  */
    /* JADX WARN: Code duplicated, block: B:478:0x0723  */
    /* JADX WARN: Code duplicated, block: B:479:0x0727  */
    /* JADX WARN: Code duplicated, block: B:481:0x072f  */
    /* JADX WARN: Code duplicated, block: B:482:0x0732  */
    /* JADX WARN: Code duplicated, block: B:484:0x073a  */
    /* JADX WARN: Code duplicated, block: B:485:0x073d  */
    /* JADX WARN: Code duplicated, block: B:487:0x0745  */
    /* JADX WARN: Code duplicated, block: B:488:0x0748  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[Catch: all -> 0x07ac, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:516:0x07a8, B:10:0x0013, B:12:0x0021, B:515:0x07a4, B:43:0x0083, B:45:0x0089, B:48:0x0094, B:81:0x00ff, B:83:0x0105, B:508:0x078e), top: B:522:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:490:0x0750  */
    /* JADX WARN: Code duplicated, block: B:491:0x0753  */
    /* JADX WARN: Code duplicated, block: B:493:0x075b  */
    /* JADX WARN: Code duplicated, block: B:494:0x075e  */
    /* JADX WARN: Code duplicated, block: B:496:0x0766  */
    /* JADX WARN: Code duplicated, block: B:497:0x0769  */
    /* JADX WARN: Code duplicated, block: B:499:0x0771  */
    /* JADX WARN: Code duplicated, block: B:500:0x0774  */
    /* JADX WARN: Code duplicated, block: B:502:0x077c  */
    /* JADX WARN: Code duplicated, block: B:503:0x077f  */
    /* JADX WARN: Code duplicated, block: B:505:0x0787  */
    /* JADX WARN: Code duplicated, block: B:506:0x078a  */
    /* JADX WARN: Code duplicated, block: B:508:0x078e A[Catch: all -> 0x07ac, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:516:0x07a8, B:10:0x0013, B:12:0x0021, B:515:0x07a4, B:43:0x0083, B:45:0x0089, B:48:0x0094, B:81:0x00ff, B:83:0x0105, B:508:0x078e), top: B:522:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:512:0x079a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff A[Catch: all -> 0x07ac, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:516:0x07a8, B:10:0x0013, B:12:0x0021, B:515:0x07a4, B:43:0x0083, B:45:0x0089, B:48:0x0094, B:81:0x00ff, B:83:0x0105, B:508:0x078e), top: B:522:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0105 A[Catch: all -> 0x07ac, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:516:0x07a8, B:10:0x0013, B:12:0x0021, B:515:0x07a4, B:43:0x0083, B:45:0x0089, B:48:0x0094, B:81:0x00ff, B:83:0x0105, B:508:0x078e), top: B:522:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0140  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean zzbq(String str) {
        String str2;
        byte b;
        String str3;
        String str4;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzacw.class) {
            if (!zzc) {
                int i = Build.VERSION.SDK_INT;
                byte b3 = Ascii.f22493FS;
                if (i <= 28) {
                    String str5 = Build.DEVICE;
                    switch (str5.hashCode()) {
                        case -1339091551:
                            b2 = !str5.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b2 = !str5.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b2 = !str5.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b2 = !str5.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b2 = !str5.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b2 = !str5.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b2 = !str5.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b2 = !str5.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (Build.VERSION.SDK_INT <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b = -1;
                                        } else {
                                            b = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b = -1;
                                        } else {
                                            b = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b = -1;
                                        } else {
                                            b = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b = -1;
                                        } else {
                                            b = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b = -1;
                                        } else {
                                            b = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b = -1;
                                        } else {
                                            b = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b = -1;
                                        } else {
                                            b = 5;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    default:
                                        if (Build.VERSION.SDK_INT <= 26) {
                                            str3 = Build.DEVICE;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.SYN;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22490CR;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.NAK;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.DC2;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22502US;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.DC4;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.DLE;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22499SI;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22498RS;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22491EM;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22503VT;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22492FF;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Base64.padSymbol;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.ETB;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.CAN;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22494GS;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = SignedBytes.MAX_POWER_OF_TWO;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = Ascii.f22500SO;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                default:
                                                    str4 = Build.MODEL;
                                                    if (str4.hashCode() == -594534941 && str4.equals("JSN-L21")) {
                                                    }
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
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case MRAID_JS_WRITE_FAILED_VALUE:
                                                case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                                case OMSDK_JS_WRITE_FAILED_VALUE:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case TPAT_RETRY_FAILED_VALUE:
                                                case 138:
                                                case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                                    z = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (Build.VERSION.SDK_INT <= 27) {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (Build.VERSION.SDK_INT <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.SYN;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22490CR;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.NAK;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.DC2;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22502US;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.DC4;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.DLE;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22499SI;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22498RS;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22491EM;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22503VT;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22492FF;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Base64.padSymbol;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.ETB;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.CAN;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22494GS;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = SignedBytes.MAX_POWER_OF_TWO;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22500SO;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        str4 = Build.MODEL;
                                        if (str4.hashCode() == -594534941) {
                                            break;
                                        }
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
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (Build.VERSION.SDK_INT <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.SYN;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22490CR;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.NAK;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.DC2;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22502US;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.DC4;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.DLE;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22499SI;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22498RS;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22491EM;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22503VT;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22492FF;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Base64.padSymbol;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.ETB;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.CAN;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22494GS;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = SignedBytes.MAX_POWER_OF_TWO;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Ascii.f22500SO;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        str4 = Build.MODEL;
                                        if (str4.hashCode() == -594534941) {
                                            break;
                                        }
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
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                }
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzbr(zzve zzveVar) {
        return Build.VERSION.SDK_INT >= 35 && zzveVar.zzh;
    }

    private static List zzbs(Context context, zzvn zzvnVar, zzv zzvVar, boolean z, boolean z2) throws zzvp {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgvz.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzact.zza(context)) {
            List listZzd = zzvx.zzd(zzvnVar, zzvVar, z, z2);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzvx.zzc(zzvnVar, zzvVar, z, z2);
    }

    private final void zzbt(zzxc zzxcVar) {
        int iZze;
        zzbf zzbfVarZzN = zzN();
        if (zzbfVarZzN.zzg() || (iZze = zzbfVarZzN.zze(zzxcVar.zza)) == -1) {
            this.zzR = -9223372036854775807L;
        } else {
            this.zzR = zzbfVarZzN.zzd(iZze, new zzbd(), false).zzd;
        }
    }

    private final void zzbu(Object obj) throws zzje {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbC();
                Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int iZze = zze();
        zzvb zzvbVarZzaI = zzaI();
        if (zzvbVarZzaI != null && this.zzr == null) {
            zzve zzveVarZzaL = zzaL();
            zzveVarZzaL.getClass();
            if (!zzby(zzveVarZzaL) || this.zzp) {
                zzaM();
                zzaE();
            } else {
                Surface surfaceZzbz = zzbz(zzveVarZzaL);
                if (surfaceZzbz != null) {
                    zzvbVarZzaI.zzn(surfaceZzbz);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvbVarZzaI.zzo();
                }
            }
        }
        if (surface != null) {
            zzbC();
        } else {
            this.zzM = null;
            zzaem zzaemVar = this.zzr;
            if (zzaemVar != null) {
                zzaemVar.zzq();
            }
        }
        if (iZze == 2) {
            zzaem zzaemVar2 = this.zzr;
            if (zzaemVar2 != null) {
                zzaemVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbv(zzip zzipVar) {
        if (zzcW() || zzipVar.zzd() || this.zzR == -9223372036854775807L) {
            return true;
        }
        return this.zzR - (zzipVar.zze - zzbg()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean zzbw(zzip zzipVar) {
        return zzipVar.zze < zzH();
    }

    private final void zzbx(long j, long j2, zzv zzvVar) {
        zzadj zzadjVar = this.zzP;
        if (zzadjVar != null) {
            zzadjVar.zzcS(j, j2, zzvVar, zzaK());
        }
    }

    private final boolean zzby(zzve zzveVar) {
        if (this.zzr != null) {
            return true;
        }
        Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbr(zzveVar) || zzaC(zzveVar);
    }

    private final Surface zzbz(zzve zzveVar) {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            return zzaemVar.zzk();
        }
        Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbr(zzveVar)) {
            return null;
        }
        zzgsw.zzi(zzaC(zzveVar));
        zzacy zzacyVar = this.zzw;
        if (zzacyVar != null) {
            if (zzacyVar.zza != zzveVar.zzf) {
                zzbA();
            }
        }
        if (this.zzw == null) {
            this.zzw = zzacy.zzb(this.zze, zzveVar.zzf);
        }
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzA(long j, boolean z, boolean z2) throws zzje {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null && !z) {
            zzaemVar.zzg(true);
        }
        if (z2) {
            this.zzG = j;
        }
        super.zzA(j, z, z2);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
        if (z) {
            zzaem zzaemVar2 = this.zzr;
            if (zzaemVar2 != null) {
                zzaemVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzC() {
        if (this.zzC > 0) {
            long jZzb = zzM().zzb();
            this.zzg.zzd(this.zzC, jZzb - this.zzB);
            this.zzC = 0;
            this.zzB = jZzb;
        }
        int i = this.zzJ;
        if (i != 0) {
            this.zzg.zze(this.zzI, i);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzb();
        } else {
            this.zzi.zzc();
        }
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzD() {
        this.zzM = null;
        this.zzR = -9223372036854775807L;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            zzaeg zzaegVar = this.zzg;
            zzaegVar.zzi(this.zza);
            zzaegVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = -9223372036854775807L;
            zzbA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzF() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null || !this.zzf) {
            return;
        }
        zzaemVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzG(zzbf zzbfVar) {
        zzxc zzxcVarZzO = zzO();
        if (zzxcVarZzO != null) {
            zzbt(zzxcVarZzO);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu, com.google.android.gms.internal.ads.zzmw
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmu
    public final boolean zzW(long j) {
        if (zzbf() == -9223372036854775807L || j < this.zzG) {
            return false;
        }
        long jZzaY = zzaY();
        return jZzaY == -9223372036854775807L || j > jZzaY;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmu
    public final void zzX(float f, float f2) throws zzje {
        super.zzX(f, f2);
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzc(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmu
    public final void zzY() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzt;
        if (i == 0 || i == 1) {
            this.zzt = 0;
        } else {
            zzaemVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final void zzZ(long j, long j2) throws Throwable {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            try {
                zzaemVar.zzv(j, j2);
            } catch (zzael e) {
                throw zzP(e, e.zza, false, 7001);
            }
        }
        super.zzZ(j, j2);
    }

    protected final void zzaA(long j) {
        zziv zzivVar = this.zza;
        zzivVar.zzk += j;
        zzivVar.zzl++;
        this.zzI += j;
        this.zzJ++;
    }

    protected final void zzaB(zzvb zzvbVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzvbVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbo();
        }
    }

    protected final boolean zzaC(zzve zzveVar) {
        if (zzbq(zzveVar.zza)) {
            return false;
        }
        return !zzveVar.zzf || zzacy.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaG(zzve zzveVar) {
        return zzby(zzveVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaO() {
        zzve zzveVarZzaL = zzaL();
        if (this.zzr != null && zzveVarZzaL != null) {
            String str = zzveVarZzaL.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaO();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaP() {
        boolean z;
        zzv zzvVarZzaJ = zzaJ();
        long j = this.zzR;
        if (j != -9223372036854775807L) {
            if (zzaQ() + j + 1 > Long.MAX_VALUE - (zzbg() + this.zzR)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.zzF == null || this.zzH || (zzvVarZzaJ != null && zzvVarZzaJ.zzr > 0) || z || zzbe() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzaR() {
        super.zzaR();
        this.zzn.clear();
        this.zzE = 0;
        this.zzT = 0;
        this.zzH = false;
        zzacf zzacfVar = this.zzk;
        if (zzacfVar != null) {
            zzacfVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zzvd zzaT(Throwable th, zzve zzveVar) {
        return new zzacq(th, zzveVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaU(zzv zzvVar) throws zzje {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null || zzaemVar.zze()) {
            return true;
        }
        try {
            zzaemVar.zzd(zzvVar);
            return true;
        } catch (zzael e) {
            throw zzP(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzaV(zzip zzipVar) throws zzje {
        ByteBuffer byteBuffer;
        zzacf zzacfVar = this.zzk;
        if (zzacfVar != null) {
            zzve zzveVarZzaL = zzaL();
            zzveVarZzaL.getClass();
            if (zzveVarZzaL.zzb.equals("video/av01") && zzipVar.zzc() && (byteBuffer = zzipVar.zzc) != null) {
                zzacfVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int iZzaW = zzaW(zzipVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaW & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final int zzaW(zzip zzipVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbw(zzipVar) || zzbv(zzipVar)) ? 0 : 32;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaX(zzip zzipVar) {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2 = false;
        if (zzbv(zzipVar)) {
            return false;
        }
        boolean zZzbw = zzbw(zzipVar);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            long jZzb = zzadnVar.zzb(zzipVar.zze);
            if (jZzb == -9223372036854775807L || jZzb >= this.zzl) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if ((!zZzbw && !z) || zzipVar.zze()) {
            return false;
        }
        if (!zzipVar.zzf()) {
            zzacf zzacfVar = this.zzk;
            if (zzacfVar != null) {
                zzve zzveVarZzaL = zzaL();
                zzveVarZzaL.getClass();
                if (zzveVarZzaL.zzb.equals("video/av01") && (byteBuffer = zzipVar.zzc) != null) {
                    boolean z3 = zZzbw || this.zzT <= 0;
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    byteBufferAsReadOnlyBuffer.flip();
                    int iZza = zzacfVar.zza(byteBufferAsReadOnlyBuffer, z3);
                    if (iZza == 0) {
                        zzipVar.zza();
                    } else if (iZza != byteBufferAsReadOnlyBuffer.limit()) {
                        zzacv zzacvVar = this.zzo;
                        zzacvVar.getClass();
                        if (zzacvVar.zzc + iZza < byteBufferAsReadOnlyBuffer.capacity() && !zzipVar.zzk()) {
                            ByteBuffer byteBuffer2 = zzipVar.zzc;
                            byteBuffer2.getClass();
                            byteBuffer2.position(iZza);
                        }
                    }
                }
            }
            if (z2) {
                if (zZzbw) {
                    this.zza.zzd++;
                    return z2;
                }
                this.zzn.add(Long.valueOf(zzipVar.zze));
                this.zzT++;
            }
            return z2;
        }
        zzipVar.zza();
        z2 = true;
        if (z2) {
            if (zZzbw) {
                this.zza.zzd++;
                return z2;
            }
            this.zzn.add(Long.valueOf(zzipVar.zze));
            this.zzT++;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzaZ(long j) {
        super.zzaZ(j);
        this.zzE--;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final boolean zzaa() {
        boolean zZzba = zzba();
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            return zzaemVar.zzh(zZzba);
        }
        if (zZzba && zzaI() == null) {
            return true;
        }
        return this.zzi.zzi(zZzba);
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final boolean zzab() {
        if (!super.zzab()) {
            return false;
        }
        zzaem zzaemVar = this.zzr;
        return zzaemVar == null || zzaemVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final int zzae(zzvn zzvnVar, zzv zzvVar) throws zzvp {
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzt != null;
        List listZzbs = zzbs(context, zzvnVar, zzvVar, z2, false);
        if (z2 && listZzbs.isEmpty()) {
            listZzbs = zzbs(context, zzvnVar, zzvVar, false, false);
        }
        if (listZzbs.isEmpty()) {
            return 129;
        }
        if (!zzbj(zzvVar)) {
            return 130;
        }
        zzve zzveVar = (zzve) listZzbs.get(0);
        boolean zZzc = zzveVar.zzc(context, zzvVar);
        if (!zZzc) {
            int i2 = 1;
            while (true) {
                if (i2 >= listZzbs.size()) {
                    z = true;
                    break;
                }
                zzve zzveVar2 = (zzve) listZzbs.get(i2);
                if (zzveVar2.zzc(context, zzvVar)) {
                    zZzc = true;
                    z = false;
                    zzveVar = zzveVar2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zZzc ? 3 : 4;
        int i4 = true != zzveVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzveVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzact.zza(context)) {
            i6 = 256;
        }
        if (zZzc) {
            List listZzbs2 = zzbs(context, zzvnVar, zzvVar, z2, true);
            if (!listZzbs2.isEmpty()) {
                zzve zzveVar3 = (zzve) zzvx.zze(context, listZzbs2, zzvVar).get(0);
                if (zzveVar3.zzc(context, zzvVar) && zzveVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final List zzaf(zzvn zzvnVar, zzv zzvVar, boolean z) throws zzvp {
        Context context = this.zze;
        return zzvx.zze(context, zzbs(context, zzvnVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zzuy zzah(zzve zzveVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        int i;
        zzacv zzacvVar;
        Point pointZzi;
        int i2;
        zzv[] zzvVarArr;
        byte b;
        boolean z;
        Pair pairZze;
        int iZzaw;
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbm = zzbm(zzveVar, zzvVar);
        int i3 = zzvVar.zzx;
        int i4 = zzvVar.zzw;
        if (length == 1) {
            if (iZzbm != -1 && (iZzaw = zzaw(zzveVar, zzvVar)) != -1) {
                iZzbm = Math.min((int) (iZzbm * 1.5f), iZzaw);
            }
            zzacvVar = new zzacv(i4, i3, iZzbm);
            i = 35;
        } else {
            int iMax = i3;
            int iMax2 = i4;
            int i5 = 0;
            boolean z2 = false;
            i = 35;
            while (i5 < length) {
                zzv zzvVarZzO = zzvVarArrZzJ[i5];
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVarZzO.zzF == null) {
                    zzt zztVarZza = zzvVarZzO.zza();
                    zztVarZza.zzE(zziVar);
                    zzvVarZzO = zztVarZza.zzO();
                }
                if (zzveVar.zzf(zzvVar, zzvVarZzO).zzd != 0) {
                    int i6 = zzvVarZzO.zzw;
                    b = -1;
                    if (i6 != -1) {
                        zzvVarArr = zzvVarArrZzJ;
                        if (zzvVarZzO.zzx != -1) {
                            z = false;
                        }
                        z2 |= z;
                        iMax2 = Math.max(iMax2, i6);
                        iMax = Math.max(iMax, zzvVarZzO.zzx);
                        iZzbm = Math.max(iZzbm, zzbm(zzveVar, zzvVarZzO));
                    } else {
                        zzvVarArr = zzvVarArrZzJ;
                    }
                    z = true;
                    z2 |= z;
                    iMax2 = Math.max(iMax2, i6);
                    iMax = Math.max(iMax, zzvVarZzO.zzx);
                    iZzbm = Math.max(iZzbm, zzbm(zzveVar, zzvVarZzO));
                } else {
                    zzvVarArr = zzvVarArrZzJ;
                    b = -1;
                }
                i5++;
                zzvVarArrZzJ = zzvVarArr;
            }
            if (z2) {
                StringBuilder sb = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax2);
                sb.append("x");
                sb.append(iMax);
                zzef.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z3 = i3 > i4;
                int i7 = z3 ? i3 : i4;
                int i8 = true != z3 ? i3 : i4;
                int[] iArr = zzb;
                int i9 = 0;
                while (true) {
                    if (i9 < 9) {
                        float f2 = i8;
                        float f3 = i7;
                        int i10 = iArr[i9];
                        int i11 = i9;
                        float f4 = i10;
                        if (i10 > i7 && (i2 = (int) (f4 * (f2 / f3))) > i8) {
                            int i12 = i7;
                            int i13 = true != z3 ? i10 : i2;
                            if (true != z3) {
                                i10 = i2;
                            }
                            pointZzi = zzveVar.zzi(i13, i10);
                            float f5 = zzvVar.zzA;
                            if (pointZzi != null) {
                                if (zzveVar.zzg(pointZzi.x, pointZzi.y, f5)) {
                                    break;
                                }
                            }
                            i9 = i11 + 1;
                            i7 = i12;
                            i8 = i8;
                            z3 = z3;
                        }
                    }
                    pointZzi = null;
                    break;
                }
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzv(iMax2);
                    zztVarZza2.zzw(iMax);
                    iZzbm = Math.max(iZzbm, zzaw(zzveVar, zztVarZza2.zzO()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax2);
                    sb2.append("x");
                    sb2.append(iMax);
                    zzef.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzacvVar = new zzacv(iMax2, iMax, iZzbm);
        }
        String str = zzveVar.zzc;
        this.zzo = zzacvVar;
        boolean z4 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i3);
        zzei.zza(mediaFormat, zzvVar.zzs);
        float f6 = zzvVar.zzA;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzei.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            zzei.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzei.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzei.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (pairZze = zzdp.zze(zzvVar)) != null) {
            zzei.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacvVar.zza);
        mediaFormat.setInteger("max-height", zzacvVar.zzb);
        zzei.zzb(mediaFormat, "max-input-size", zzacvVar.zzc);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z4) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzN));
        }
        zzbi(mediaFormat);
        Surface surfaceZzbz = zzbz(zzveVar);
        if (this.zzr != null && !zzfk.zzT(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuy.zzb(zzveVar, mediaFormat, zzvVar, surfaceZzbz, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zziw zzai(zzve zzveVar, zzv zzvVar, zzv zzvVar2) {
        int i;
        int i2;
        zziw zziwVarZzf = zzveVar.zzf(zzvVar, zzvVar2);
        int i3 = zziwVarZzf.zze;
        zzacv zzacvVar = this.zzo;
        zzacvVar.getClass();
        if (zzvVar2.zzw > zzacvVar.zza || zzvVar2.zzx > zzacvVar.zzb) {
            i3 |= 256;
        }
        if (zzbm(zzveVar, zzvVar2) > zzacvVar.zzc) {
            i3 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE) {
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                float f2 = zzvVar2.zzA;
                if (f2 != -1.0f && Math.abs(f2 - f) > 1.0f && (Build.VERSION.SDK_INT < 30 || (Build.VERSION.SDK_INT == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i3 |= 65536;
                }
            }
        }
        String str = zzveVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zziwVarZzf.zzd;
        }
        return new zziw(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final float zzak(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzve zzveVarZzaL;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f2 = zzvVar2.zzA;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.zzF == null || (zzveVarZzaL = zzaL()) == null) {
            return f3;
        }
        float fZzh = zzveVarZzaL.zzh(zzvVar.zzw, zzvVar.zzx);
        return f3 != -1.0f ? Math.max(f3, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzal(String str, zzuy zzuyVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzp = zzbq(str);
        zzve zzveVarZzaL = zzaL();
        zzveVarZzaL.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzveVarZzaL.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzveVarZzaL.zzb()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.zzq = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzam(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzan(Exception exc) {
        zzef.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zziw zzao(zzlq zzlqVar) throws zzje {
        zziw zziwVarZzao = super.zzao(zzlqVar);
        zzv zzvVar = zzlqVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zziwVarZzao);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
        return zziwVarZzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzap(zzv zzvVar, MediaFormat mediaFormat) {
        zzvb zzvbVarZzaI = zzaI();
        if (zzvbVarZzaI != null) {
            zzvbVarZzaI.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzC;
        int i = zzvVar.zzB;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzL = new zzbv(integer, integer2, f);
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null || !this.zzS) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzv(integer);
            zztVarZza.zzw(integer2);
            zztVarZza.zzB(f);
            zzv zzvVarZzO = zztVarZza.zzO();
            int i3 = this.zzt;
            List listZzi = this.zzu;
            if (listZzi == null) {
                listZzi = zzgvz.zzi();
            }
            zzaemVar.zzs(1, zzvVarZzO, zzbh(), i3, listZzi);
            this.zzt = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzaq(long j, long j2, long j3, boolean z, boolean z2) throws zzje {
        int iZzR;
        if (this.zzr != null && this.zzf) {
            j2 -= -this.zzQ;
        }
        if (j >= -500000 || z || (iZzR = zzR(j2)) == 0) {
            return false;
        }
        this.zzG = j2;
        if (z2) {
            zziv zzivVar = this.zza;
            int i = zzivVar.zzd + iZzR;
            zzivVar.zzd = i;
            zzivVar.zzf += this.zzE;
            zzivVar.zzd = i + this.zzn.size();
        } else {
            this.zza.zzj++;
            zzaz(iZzR + this.zzn.size(), this.zzE);
        }
        zzaN();
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzar() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzi();
            long jZzbh = this.zzQ;
            if (jZzbh == -9223372036854775807L) {
                jZzbh = zzbh();
                this.zzQ = jZzbh;
            }
            this.zzr.zzo(-jZzbh);
        } else {
            this.zzi.zza(2);
        }
        this.zzS = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzat(zzit zzitVar) {
        this.zzg.zzk(zzitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzau() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzi();
        } else if (zzbe() != -9223372036854775807L) {
            zzbe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzav(zzip zzipVar) throws zzje {
        if (this.zzq) {
            ByteBuffer byteBuffer = zzipVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvb zzvbVarZzaI = zzaI();
                        zzvbVarZzaI.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvbVarZzaI.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzax(zzvb zzvbVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzvbVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzay(zzvb zzvbVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzvbVar.zzc(i, false);
        Trace.endSection();
        zzaz(0, 1);
    }

    protected final void zzaz(int i, int i2) {
        zziv zzivVar = this.zza;
        zzivVar.zzh += i;
        int i3 = i + i2;
        zzivVar.zzg += i3;
        this.zzC += i3;
        int i4 = this.zzD + i3;
        this.zzD = i4;
        zzivVar.zzi = Math.max(i4, zzivVar.zzi);
    }

    final /* synthetic */ Surface zzbp() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzy(boolean z, boolean z2) throws zzje {
        super.zzy(z, z2);
        zzK();
        this.zzg.zza(this.zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                zzada zzadaVar = new zzada(this.zze, this.zzi);
                zzadaVar.zza(true);
                zzadaVar.zzc(-this.zzl);
                zzadaVar.zzb(zzM());
                zzadi zzadiVarZzd = zzadaVar.zzd();
                zzadiVarZzd.zza(1);
                this.zzr = zzadiVarZzd.zzb(0);
            }
            this.zzs = true;
        }
        int i = !z2 ? 1 : 0;
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null) {
            zzadm zzadmVar = this.zzi;
            zzadmVar.zzg(zzM());
            zzadmVar.zza(i);
            return;
        }
        zzaemVar.zzc(new zzacr(this), zzhbz.zza());
        zzadj zzadjVar = this.zzP;
        if (zzadjVar != null) {
            this.zzr.zzl(zzadjVar);
        }
        if (this.zzv != null && !this.zzx.equals(zzet.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbb());
        List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i;
        zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzz(zzv[] zzvVarArr, long j, long j2, zzxc zzxcVar) throws zzje {
        super.zzz(zzvVarArr, j, j2, zzxcVar);
        zzbt(zzxcVar);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzas(long j, long j2, zzvb zzvbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzje {
        long jZzb;
        zzacw zzacwVar;
        long j4;
        zzvbVar.getClass();
        long jZzbg = j3 - zzbg();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzn;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzaz(i4, 0);
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            if (!z || z2) {
                return zzaemVar.zzu(j3, new zzacs(this, zzvbVar, i, jZzbg));
            }
            zzax(zzvbVar, i, jZzbg);
            return true;
        }
        zzadm zzadmVar = this.zzi;
        long jZzbh = zzbh();
        zzadk zzadkVar = this.zzj;
        int iZzk = zzadmVar.zzk(j3, j, j2, jZzbh, z, z2, zzadkVar);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar == null) {
            if (iZzk != 0) {
                long jZzc = zzM().zzc();
                zzbx(jZzbg, jZzc, zzvVar);
                zzaB(zzvbVar, i, jZzbg, jZzc);
                zzaA(zzadkVar.zza());
                return true;
            }
            if (iZzk != 1) {
                jZzb = zzadkVar.zzb();
                long jZza = zzadkVar.zza();
                if (jZzb == this.zzK) {
                    zzax(zzvbVar, i, jZzbg);
                    j4 = jZzb;
                    zzacwVar = this;
                } else {
                    zzbx(jZzbg, jZzb, zzvVar);
                    zzaB(zzvbVar, i, jZzbg, jZzb);
                    zzacwVar = this;
                    j4 = jZzb;
                }
                zzacwVar.zzaA(jZza);
                zzacwVar.zzK = j4;
                return true;
            }
            if (iZzk != 2) {
                zzay(zzvbVar, i, jZzbg);
                zzaA(zzadkVar.zza());
                return true;
            }
            if (iZzk == 3) {
                zzax(zzvbVar, i, jZzbg);
                zzaA(zzadkVar.zza());
                return true;
            }
        } else if (iZzk != 5 && iZzk != 4) {
            zzadnVar.zza(j3, zzadkVar.zza());
            if (iZzk != 0) {
                long jZzc2 = zzM().zzc();
                zzbx(jZzbg, jZzc2, zzvVar);
                zzaB(zzvbVar, i, jZzbg, jZzc2);
                zzaA(zzadkVar.zza());
                return true;
            }
            if (iZzk != 1) {
                jZzb = zzadkVar.zzb();
                long jZza2 = zzadkVar.zza();
                if (jZzb == this.zzK) {
                    zzax(zzvbVar, i, jZzbg);
                    j4 = jZzb;
                    zzacwVar = this;
                } else {
                    zzbx(jZzbg, jZzb, zzvVar);
                    zzaB(zzvbVar, i, jZzbg, jZzb);
                    zzacwVar = this;
                    j4 = jZzb;
                }
                zzacwVar.zzaA(jZza2);
                zzacwVar.zzK = j4;
                return true;
            }
            if (iZzk != 2) {
                zzay(zzvbVar, i, jZzbg);
                zzaA(zzadkVar.zza());
                return true;
            }
            if (iZzk == 3) {
                zzax(zzvbVar, i, jZzbg);
                zzaA(zzadkVar.zza());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmp
    public final void zzx(int i, Object obj) throws zzje {
        if (i == 1) {
            zzbu(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzadj zzadjVar = (zzadj) obj;
            this.zzP = zzadjVar;
            zzaem zzaemVar = this.zzr;
            if (zzaemVar != null) {
                zzaemVar.zzl(zzadjVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzO != iIntValue) {
                this.zzO = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzz = iIntValue2;
            zzvb zzvbVarZzaI = zzaI();
            if (zzvbVarZzaI != null) {
                zzvbVarZzaI.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzA = iIntValue3;
            zzaem zzaemVar2 = this.zzr;
            if (zzaemVar2 != null) {
                zzaemVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzaem zzaemVar3 = this.zzr;
                if (zzaemVar3 == null || !zzaemVar3.zze()) {
                    return;
                }
                zzaemVar3.zzf();
                return;
            }
            this.zzu = list;
            zzaem zzaemVar4 = this.zzr;
            if (zzaemVar4 != null) {
                zzaemVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzet zzetVar = (zzet) obj;
            if (zzetVar.zza() == 0 || zzetVar.zzb() == 0) {
                return;
            }
            this.zzx = zzetVar;
            zzaem zzaemVar5 = this.zzr;
            if (zzaemVar5 != null) {
                Surface surface = this.zzv;
                surface.getClass();
                zzaemVar5.zzp(surface, zzetVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzN = ((Integer) obj).intValue();
                zzvb zzvbVarZzaI2 = zzaI();
                if (zzvbVarZzaI2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzN));
                    zzvbVarZzaI2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzv;
                zzbu(null);
                obj.getClass();
                ((zzacw) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzF != null;
                zznb zznbVar = (zznb) obj;
                this.zzF = zznbVar;
                if (z != (zznbVar != null)) {
                    zzbd();
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
