create table if not exists guaranteed_student_loan_category(
loan_code varchar(255) not null,
loan_name varchar(255) null,
loan_description varchar(255) null,
loan_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint guaranteed_student_loan_category_pk primary key(loan_code));