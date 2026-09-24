package com.ironsource;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12601x8 extends File {
    public C12601x8(String str, String str2) {
        super(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m34139a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public C12601x8(String str) {
        super(str);
    }
}
