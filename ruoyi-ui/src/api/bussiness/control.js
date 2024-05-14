import request from '@/utils/request'

// 查询评价权重列表
export function listControl(query) {
  return request({
    url: '/bussiness/control/list',
    method: 'get',
    params: query
  })
}

// 查询评价权重详细
export function getControl(id) {
  return request({
    url: '/bussiness/control/' + id,
    method: 'get'
  })
}

// 新增评价权重
export function addControl(data) {
  return request({
    url: '/bussiness/control',
    method: 'post',
    data: data
  })
}

// 修改评价权重
export function updateControl(data) {
  return request({
    url: '/bussiness/control',
    method: 'put',
    data: data
  })
}

// 删除评价权重
export function delControl(id) {
  return request({
    url: '/bussiness/control/' + id,
    method: 'delete'
  })
}
