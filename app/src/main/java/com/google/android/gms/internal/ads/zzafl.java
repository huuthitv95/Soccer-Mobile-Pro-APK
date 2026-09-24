package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.media3.common.MimeTypes;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafl implements zzafv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzafk zzc = new zzafk(zzafi.zza);
    private static final zzafk zzd = new zzafk(zzafh.zza);
    private zzgvz zze;
    private final zzanc zzf = new zzamx();

    @Override // com.google.android.gms.internal.ads.zzafv
    public final synchronized zzafp[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzafv
    public final synchronized zzafp[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        byte b;
        int i;
        int i2;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str != null) {
            String strZzh = zzas.zzh(str);
            switch (strZzh.hashCode()) {
                case -2123537834:
                    if (strZzh.equals("audio/eac3-joc")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1662384011:
                    if (strZzh.equals("video/mp2p")) {
                        b = 20;
                    } else {
                        b = -1;
                    }
                    break;
                case -1662384007:
                    if (strZzh.equals("video/mp2t")) {
                        b = 21;
                    } else {
                        b = -1;
                    }
                    break;
                case -1662095187:
                    if (strZzh.equals("video/webm")) {
                        b = 12;
                    } else {
                        b = -1;
                    }
                    break;
                case -1606874997:
                    if (strZzh.equals("audio/amr-wb")) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case -1487656890:
                    if (strZzh.equals(MimeTypes.IMAGE_AVIF)) {
                        b = Ascii.f22502US;
                    } else {
                        b = -1;
                    }
                    break;
                case -1487464693:
                    if (strZzh.equals(MimeTypes.IMAGE_HEIC)) {
                        b = Ascii.f22498RS;
                    } else {
                        b = -1;
                    }
                    break;
                case -1487464690:
                    if (strZzh.equals(MimeTypes.IMAGE_HEIF)) {
                        b = Ascii.f22494GS;
                    } else {
                        b = -1;
                    }
                    break;
                case -1487394660:
                    if (strZzh.equals("image/jpeg")) {
                        b = Ascii.CAN;
                    } else {
                        b = -1;
                    }
                    break;
                case -1487018032:
                    if (strZzh.equals(MimeTypes.IMAGE_WEBP)) {
                        b = Ascii.ESC;
                    } else {
                        b = -1;
                    }
                    break;
                case -1248337486:
                    if (strZzh.equals("application/mp4")) {
                        b = Ascii.DC2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1079884372:
                    if (strZzh.equals("video/x-msvideo")) {
                        b = Ascii.f22491EM;
                    } else {
                        b = -1;
                    }
                    break;
                case -1004728940:
                    if (strZzh.equals("text/vtt")) {
                        b = Ascii.ETB;
                    } else {
                        b = -1;
                    }
                    break;
                case -879272239:
                    if (strZzh.equals(MimeTypes.IMAGE_BMP)) {
                        b = Ascii.f22493FS;
                    } else {
                        b = -1;
                    }
                    break;
                case -879258763:
                    if (strZzh.equals(MimeTypes.IMAGE_PNG)) {
                        b = Ascii.SUB;
                    } else {
                        b = -1;
                    }
                    break;
                case -387023398:
                    if (strZzh.equals("audio/x-matroska")) {
                        b = 11;
                    } else {
                        b = -1;
                    }
                    break;
                case -43467528:
                    if (strZzh.equals("application/webm")) {
                        b = 14;
                    } else {
                        b = -1;
                    }
                    break;
                case 13915911:
                    if (strZzh.equals("video/x-flv")) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case 187078296:
                    if (strZzh.equals("audio/ac3")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case 187078297:
                    if (strZzh.equals("audio/ac4")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 187078669:
                    if (strZzh.equals("audio/amr")) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case 187090232:
                    if (strZzh.equals("audio/mp4")) {
                        b = 17;
                    } else {
                        b = -1;
                    }
                    break;
                case 187091926:
                    if (strZzh.equals("audio/ogg")) {
                        b = 19;
                    } else {
                        b = -1;
                    }
                    break;
                case 187099443:
                    if (strZzh.equals("audio/wav")) {
                        b = Ascii.SYN;
                    } else {
                        b = -1;
                    }
                    break;
                case 1331848029:
                    if (strZzh.equals("video/mp4")) {
                        b = Ascii.DLE;
                    } else {
                        b = -1;
                    }
                    break;
                case 1503095341:
                    if (strZzh.equals("audio/3gpp")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case 1504578661:
                    if (strZzh.equals("audio/eac3")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case 1504619009:
                    if (strZzh.equals("audio/flac")) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                case 1504824762:
                    if (strZzh.equals("audio/midi")) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    break;
                case 1504831518:
                    if (strZzh.equals("audio/mpeg")) {
                        b = 15;
                    } else {
                        b = -1;
                    }
                    break;
                case 1505118770:
                    if (strZzh.equals("audio/webm")) {
                        b = 13;
                    } else {
                        b = -1;
                    }
                    break;
                case 2039520277:
                    if (strZzh.equals("video/x-matroska")) {
                        b = 10;
                    } else {
                        b = -1;
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
                    i = 0;
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case 8:
                    i = 5;
                    break;
                case 9:
                    i = 15;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    i = 6;
                    break;
                case 15:
                    i = 7;
                    break;
                case 16:
                case 17:
                case 18:
                    i = 8;
                    break;
                case 19:
                    i = 9;
                    break;
                case 20:
                    i = 10;
                    break;
                case 21:
                    i = 11;
                    break;
                case 22:
                    i = 12;
                    break;
                case 23:
                    i = 13;
                    break;
                case 24:
                    i = 14;
                    break;
                case 25:
                    i = 16;
                    break;
                case 26:
                    i = 17;
                    break;
                case 27:
                    i = 18;
                    break;
                case 28:
                    i = 19;
                    break;
                case 29:
                case 30:
                    i = 20;
                    break;
                case 31:
                    i = 21;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            zzc(i, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i2 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i2 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i2 = 1;
        } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            i2 = 2;
        } else if (lastPathSegment.endsWith(".amr")) {
            i2 = 3;
        } else if (lastPathSegment.endsWith(".flac")) {
            i2 = 4;
        } else if (lastPathSegment.endsWith(".flv")) {
            i2 = 5;
        } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            i2 = 15;
        } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            i2 = 6;
        } else if (lastPathSegment.endsWith(".mp3")) {
            i2 = 7;
        } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            i2 = 8;
        } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            i2 = 9;
        } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            i2 = 10;
        } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            i2 = 11;
        } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            i2 = 12;
        } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            i2 = 13;
        } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            i2 = 14;
        } else if (lastPathSegment.endsWith(".avi")) {
            i2 = 16;
        } else if (lastPathSegment.endsWith(".png")) {
            i2 = 17;
        } else if (lastPathSegment.endsWith(".webp")) {
            i2 = 18;
        } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            i2 = 19;
        } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            i2 = 20;
        } else if (lastPathSegment.endsWith(".avif")) {
            i2 = 21;
        } else {
            i2 = -1;
        }
        if (i2 != -1 && i2 != i) {
            zzc(i2, arrayList);
        }
        int[] iArr = zzb;
        for (int i3 = 0; i3 < 21; i3++) {
            int i4 = iArr[i3];
            if (i4 != i && i4 != i2) {
                zzc(i4, arrayList);
            }
        }
        return (zzafp[]) arrayList.toArray(new zzafp[0]);
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzapb());
                break;
            case 1:
                list.add(new zzape());
                break;
            case 2:
                list.add(new zzaph(0));
                break;
            case 3:
                list.add(new zzahk(0));
                break;
            case 4:
                zzafp zzafpVarZza = zzc.zza(0);
                if (zzafpVarZza == null) {
                    list.add(new zzaib(0));
                } else {
                    list.add(zzafpVarZza);
                }
                break;
            case 5:
                list.add(new zzaie());
                break;
            case 6:
                list.add(new zzakb(this.zzf, 0));
                break;
            case 7:
                list.add(new zzakj(0));
                break;
            case 8:
                zzanc zzancVar = this.zzf;
                list.add(new zzalk(zzancVar, 192, null, null, zzgvz.zzi(), null));
                list.add(new zzalv(zzancVar, 160));
                break;
            case 9:
                list.add(new zzaml());
                break;
            case 10:
                list.add(new zzaql());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgvz.zzi();
                }
                list.add(new zzaqw(1, 0, this.zzf, new zzfh(0L), new zzapj(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzarj());
                break;
            case 14:
                list.add(new zzail(0));
                break;
            case 15:
                zzafp zzafpVarZza2 = zzd.zza(new Object[0]);
                if (zzafpVarZza2 != null) {
                    list.add(zzafpVarZza2);
                }
                break;
            case 16:
                list.add(new zzaho(0, this.zzf));
                break;
            case 17:
                list.add(new zzamv());
                break;
            case 18:
                list.add(new zzaro());
                break;
            case 19:
                list.add(new zzahw());
                break;
            case 20:
                list.add(new zzaik(0));
                break;
            case 21:
                list.add(new zzahv());
                break;
        }
    }
}
