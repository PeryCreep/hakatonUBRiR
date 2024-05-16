CREATE TABLE office (
                        uuid UUID PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        city VARCHAR(255) NOT NULL,
                        created_date TIMESTAMP NOT NULL,
                        created_by UUID NOT NULL
);

CREATE TABLE warehouse (
                           uuid UUID PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           city VARCHAR(255) NOT NULL,
                           created_date TIMESTAMP NOT NULL,
                           created_by UUID NOT NULL
);

CREATE TABLE worker (
                        uuid UUID PRIMARY KEY,
                        first_name VARCHAR(255) NOT NULL,
                        last_name VARCHAR(255) NOT NULL,
                        middle_name VARCHAR(255),
                        post VARCHAR(255) NOT NULL,
                        role VARCHAR(255) NOT NULL,
                        office_id UUID REFERENCES office(uuid),
                        created_date TIMESTAMP NOT NULL
);

CREATE TABLE workplace (
                           uuid UUID PRIMARY KEY,
                           number VARCHAR(255) NOT NULL,
                           current_worker_id UUID REFERENCES worker(uuid),
                           office_id UUID REFERENCES office(uuid),
                           created_date TIMESTAMP NOT NULL,
                           created_by UUID NOT NULL
);

CREATE TABLE technique (
                           identifier VARCHAR(255) NOT NULL PRIMARY KEY,
                           worker_id UUID REFERENCES worker(uuid),
                           office_id UUID REFERENCES office(uuid),
                           workplace_id UUID REFERENCES workplace(uuid),
                           warehouse_id UUID REFERENCES warehouse(uuid),
                           created_date TIMESTAMP NOT NULL,
                           created_by UUID NOT NULL
);

