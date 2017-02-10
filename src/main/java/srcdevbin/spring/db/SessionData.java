package srcdevbin.spring.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SessionData {
	
    @Id
    @Column(length=40)
    private String id;

    @Column(name="session_name")
    private String sessionName;

    @Column(name="data_file")
    private byte[] dataFile;

    public SessionData() {
    }

    public SessionData(String id, String sessionName, byte[] dataFile) {
        this.id = id;
        this.sessionName = sessionName;
        this.dataFile = dataFile;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public byte[] getDataFile() {
		return dataFile;
	}

	public void setDataFile(byte[] dataFile) {
		this.dataFile = dataFile;
	}
}