package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.O9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11597O9 {

    /* JADX INFO: renamed from: com.ironsource.O9$a */
    class a extends GZIPOutputStream {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f25282a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OutputStream outputStream, int i) throws IOException {
            super(outputStream);
            this.f25282a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m26742a(String str, int i) throws Exception {
        byte[] byteArray = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (OutOfMemoryError e) {
            C12317m4.m32153d().m32155a(e);
            String str2 = "Error while compressing:" + e.getMessage();
            IronLog.INTERNAL.error(str2);
            m26743b(str2);
            return byteArray;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m26743b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObject));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m26741a(String str) throws Exception {
        return m26742a(str, -1);
    }

    /* JADX INFO: renamed from: a */
    public static String m26740a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (OutOfMemoryError e2) {
            C12317m4.m32153d().m32155a(e2);
            String str = "Error while decompressing:" + e2.getMessage();
            IronLog.INTERNAL.error(str);
            m26743b(str);
            return null;
        }
    }
}
