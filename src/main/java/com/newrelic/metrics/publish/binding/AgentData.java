package com.newrelic.metrics.publish.binding;

import java.util.HashMap;

/**
 * Provisional API which is subject to change.
 * Represents an agent for a given {@link Request}.
 */
public class AgentData {
    public String host = "host";
    public String version;
    public int pid = 0;

    /* package */ AgentData() {
        super();
    }

    /* package */ HashMap<String, Object> serialize() {
        HashMap<String, Object> output = new HashMap<String, Object>();
        output.put("host", host);
        output.put("version", version);
        output.put("pid", pid);
        return output;
    }

}
