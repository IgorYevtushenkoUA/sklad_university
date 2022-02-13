select p.gorup_id from _products p
group by p.group_id
having count(p.groups_id) = 0;