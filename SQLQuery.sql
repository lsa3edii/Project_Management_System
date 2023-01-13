create database ProjectManagement;

use ProjectManagement
go

create table Admin (
	id int,
	name varchar(20) not null,
	password varchar(20) not null,

	constraint Admin_pk primary key (id),
);

create table project_manager (
	id int primary key,
	name varchar(20) not null,
	password varchar(20) not null,
	position varchar(20) not null,
	admin_id int,

	--constraint project_manager_pk primary key (id),

	--constraint admin_manager_fk foreign key (admin_id)
	--references admin (id)
);

alter table project_manager
add admin_id int

alter table project_manager
add constraint admin_manager_fk foreign key (admin_id)
references admin (id)

alter table team_leader
add admin_id int

alter table team_leader
add constraint admin_leader_fk foreign key (admin_id)
references admin (id)

alter table employee
add admin_id int

alter table employee
add constraint admin_employee_fk foreign key (admin_id)
references admin (id)

alter table projects
add admin_id int

alter table projects
add constraint admin_projects_fk foreign key (admin_id)
references admin (id)


create table team_leader (
	id int,
	name varchar(20) not null,
	password varchar(20) not null,
	position varchar(20) not null,
	pm_id int,
	admin_id int,

	constraint team_leader_pk primary key (id),

	constraint manager_leader_fk foreign key (pm_id)
	references project_manager (id),

	--constraint admin_leader_fk foreign key (admin_id)
	--references admin (id)
);

create table employee (
	id int,
	name varchar(20) not null,
	password varchar(20) not null,
	position varchar(20) not null,
	penalty int,
	tl_id int,
	pm_id int,
	admin_id int,

	constraint employee_manager_pk primary key (id),

	constraint leader_employee_fk foreign key (tl_id)
	references team_leader (id),

	constraint manager_employee_fk foreign key (pm_id)
	references project_manager (id),

	--constraint admin_employee_fk foreign key (admin_id)
	--references admin (id)

);

create table projects (
	id int,
	project_name varchar(20) not null,
	progress varchar(20) not null,
	tl_id int,
	pm_id int,

	constraint projects_pk primary key (id),

	constraint leader_projects_fk foreign key (tl_id)
	references team_leader (id),

	constraint manager_projects_fk foreign key (pm_id)
	references project_manager (id)
);

create table tasks (
	id int,
	task_name varchar(20) not null,
	task_state varchar(20) not null,
	employee_id int,
	tl_id int,
	project_id int,

	constraint tasks_pk primary key (id),

	constraint employee_tasks_fk foreign key (employee_id)
	references employee (id),

	constraint leader_tasks_fk foreign key (tl_id)
	references team_leader (id),

	constraint projects_tasks_fk foreign key (project_id)
	references projects (id)
);

--select project_name, progress, pm_id from projects p inner join project_manager m
--on p.pm_id = 2;

--select project_name, progress, pm_id from projects p where p.pm_id = 1

create table attendance (
	id int identity(1,1) primary key,
	enter_time varchar(20),
	exit_time varchar(20),
	date varchar(20),
	employee_id int,

	constraint employee_attendance_fk foreign key (employee_id)
	references employee (id)
);

create table vacation (
	id int identity(1,1) primary key,
	day_from varchar(20),
	day_to varchar(20),
	reson varchar(20),
	state varchar(20),
	employee_id int,

	constraint employee_vacation_fk foreign key (employee_id)
	references employee (id)
);

create table reports (
	id int identity(1,1) primary key,
	report varchar(100),
	tl_id int,

	constraint leader_reports_fk foreign key (tl_id)
	references team_leader (id)
);

--create table penalties (
--	id int identity(1,1) primary key,
--	penalty int,
--	employee_id int,

--	constraint employee_penalties_fk foreign key (employee_id)
--	references employee (id)
--);

--select date, employee_id from attendance a, employee e 
--where a.employee_id = e.id and e.pm_id = 1

--select date, employee_id, name from vacation v, employee e
--where v.employee_id = e.id and e.pm_id = 3

--drop table vacation, attendance
