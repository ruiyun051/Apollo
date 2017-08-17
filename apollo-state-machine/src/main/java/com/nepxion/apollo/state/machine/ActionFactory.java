package com.nepxion.apollo.state.machine;

/**
 * <p>Title: Nepxion Apollo</p>
 * <p>Description: Nepxion Apollo For Spring Cloud</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import java.util.Arrays;
import java.util.List;

import com.nepxion.apollo.state.machine.enums.Actions;
import com.nepxion.apollo.state.machine.enums.States;

public class ActionFactory {
    public static List<Actions> getActions(States states) {
        switch (states) {
            case STATE_WAIT_AUDIT:
                return Arrays.asList(Actions.ACTION_TO_AUDIT, Actions.ACTION_TO_DELETE);
            case STATE_AUDIT_REJECT:
                return Arrays.asList(Actions.ACTION_TO_DELETE);
            case STATE_WAIT_SEND:
                return Arrays.asList(Actions.ACTION_TO_SEND, Actions.ACTION_TO_DELETE);
            case STATE_SEND_COMPLETE:
                return Arrays.asList(Actions.ACTION_TO_DOWNLOAD);
            case STATE_DELETE_COMPLETE:
                return Arrays.asList();
        }

        return null;
    }
}