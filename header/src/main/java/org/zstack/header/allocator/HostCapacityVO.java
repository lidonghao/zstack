package org.zstack.header.allocator;

import org.zstack.header.host.HostEO;
import org.zstack.header.vo.ForeignKey;
import org.zstack.header.vo.ForeignKey.ReferenceOption;
import org.zstack.header.vo.Index;

import javax.persistence.*;

@Entity
@Table
public class HostCapacityVO {
	@Id
	@Column
    @ForeignKey(parentEntityClass = HostEO.class, onDeleteAction = ReferenceOption.CASCADE)
	private String uuid;
	
	@Column
    @Index
	private long totalMemory;
	
	@Column
    @Index
	private long totalCpu;

    @Column
    @Index
    private long availableMemory;

    @Column
    @Index
    private long availableCpu;

	public HostCapacityVO() {
	}

    public long getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(long availableMemory) {
        this.availableMemory = availableMemory;
    }

    public long getAvailableCpu() {
        return availableCpu;
    }

    public void setAvailableCpu(long availableCpu) {
        this.availableCpu = availableCpu;
    }

    public String getUuid() {
    	return uuid;
    }

	public void setUuid(String uuid) {
    	this.uuid = uuid;
    }

	public long getTotalMemory() {
    	return totalMemory;
    }

	public void setTotalMemory(long totalMemory) {
    	this.totalMemory = totalMemory;
    }

	public long getTotalCpu() {
    	return totalCpu;
    }

	public void setTotalCpu(long totalCpu) {
    	this.totalCpu = totalCpu;
    }

	public long getUsedMemory() {
    	return totalMemory - availableMemory;
    }

	public long getUsedCpu() {
    	return totalCpu - availableCpu;
    }
}
