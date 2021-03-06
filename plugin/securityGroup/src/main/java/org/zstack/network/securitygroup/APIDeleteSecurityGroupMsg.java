package org.zstack.network.securitygroup;

import org.zstack.header.message.APIDeleteMessage;
import org.zstack.header.message.APIMessage;
import org.zstack.header.message.APIParam;
/**
 * @api
 * delete security group
 *
 * @category security group
 *
 * @since 0.1.0
 *
 * @cli
 *
 * @httpMsg
 * {
"org.zstack.network.securitygroup.APIDeleteSecurityGroupMsg": {
"uuid": "57e6730f5afa4f78ad66d2a289a91287",
"deleteMode": "Permissive",
"session": {
"uuid": "a27df307deaf44a59586707384170b0b"
}
}
}
 *
 * @msg
 * {
"org.zstack.network.securitygroup.APIDeleteSecurityGroupMsg": {
"uuid": "57e6730f5afa4f78ad66d2a289a91287",
"deleteMode": "Permissive",
"session": {
"uuid": "a27df307deaf44a59586707384170b0b"
},
"timeout": 1800000,
"id": "90644afefacb4d9abbf60ddf766973b0",
"serviceId": "api.portal"
}
}
 *
 * @result
 * see :ref:`APIDeleteSecurityGroupEvent`
 */
public class APIDeleteSecurityGroupMsg extends APIDeleteMessage {
    /**
     * @desc security group uuid
     */
    @APIParam
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String securityGroupUuid) {
        this.uuid = securityGroupUuid;
    }
}
